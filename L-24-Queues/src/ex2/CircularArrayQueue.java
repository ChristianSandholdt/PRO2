package ex2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.NoSuchElementException;

public class CircularArrayQueue<E> implements QueueI<E>{

    private E[] elements;
    private int currentSize;
    private int head;
    private int tail;


    public CircularArrayQueue(){
        final int capacity = 10;
        elements = (E[]) new Object[capacity];
        currentSize = 0;
        head = 0;
        tail = 0;
    }
    @Override
    public void add(E entry) {
        extendCapacityIfNeeded();
        currentSize++;
        elements[tail] = entry;
        tail = (tail + 1) % elements.length;
    }

    public void extendCapacityIfNeeded(){
        if (currentSize == elements.length){
            E[] temp = (E[]) new Object[2*elements.length];
            for (int i = 0; i < elements.length; i++){
                temp[i] = (E)elements[(head + i) % elements.length];
            }
            elements = temp;
            head = 0;
            tail = currentSize;
        }
    }

    @Override
    public E remove() {
        if (currentSize == 0){
            throw new NoSuchElementException();
        }
        E removed = elements[head];
        elements[head] = null;
        head = (head + 1) % elements.length;
        currentSize--;
        return removed;
    }

    @Override
    public E element() {
        return elements[head];
    }

    @Override
    public boolean isEmpty() {
        return currentSize == 0;
    }

    @Override
    public void clear() {
        for (int i = elements.length - 1; i > 0; i--){
            Array.set(elements,i,null);
        }
        head = 0;
        tail = 0;
        currentSize = 0;
    }

    @Override
    public int size() {
        return currentSize;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < elements.length; i++){
            if (Array.get(elements,i) != null){
                sb.append(Array.get(elements,i)).append(", ");
            }
        }
        return sb.toString();
    }

}

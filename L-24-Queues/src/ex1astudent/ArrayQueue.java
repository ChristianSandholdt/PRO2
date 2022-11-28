package ex1astudent;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayQueue<E> implements QueueI<E> {



    private E[] entries;
    private int head;
    private int tail;
    private int count;

    public ArrayQueue(int capacity){
        E[] temp = (E[]) new Object[capacity];
        entries = temp;
        head = 0;
        tail = 0;
    }

    private void extendQueueCapacity(){
        @SuppressWarnings("unchecked")
        E[] temp = (E[]) new Object[entries.length*2];
        System.arraycopy(entries,0,temp,0,entries.length);
        entries = temp;
    }

    @Override
    public void add(E entry) {
        if (isEmpty()){
            extendQueueCapacity();
        }

        Array.set(entries,tail,entry);
        System.out.println("Element " + entry + " added");
        tail++;
        count++;
    }

    @Override
    public E remove() {
        E temp = (E) Array.get(entries, head);
        Array.set(entries,head,null);
        head++;
        count--;
        return temp;
    }

    @Override
    public E element() {
        return (E) Array.get(entries,head);
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public void clear() {
        for (int i = entries.length - 1; i > 0; i--){
            Array.set(entries,i,null);
        }
        head = 0;
        tail = 0;
        count = 0;
    }

    @Override
    public int size() {
        return count;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < entries.length; i++){
            if (Array.get(entries,i) != null){
                sb.append(Array.get(entries,i)).append(", ");
            }
        }
        return sb.toString();
    }
}

package ex1student;

import java.lang.reflect.Array;
import java.util.NoSuchElementException;

public class ArrayStack<E> implements StackI<E> {
    // the index of the top entry in the stack,
    // top is -1 if the stack is empty
    private int top;
    // contains the entries in the stack
    private E[] entries;

    public ArrayStack() {
        this(10);
    }

    public ArrayStack(int capacity) {
        @SuppressWarnings("unchecked")
        E[] temp = (E[]) new Object[capacity];
        entries = temp;
        top = -1;
    }

    /**
     * Adds a new entry to the top of this stack.
     */
    @Override
    public void push(E entry) {
        if (top == entries.length - 1) {
            this.extendStackCapacity();
        }
        top++;
        Array.set(entries, top, entry);

        // TODO
    }

    private void extendStackCapacity() {
        @SuppressWarnings("unchecked")
        E[] temp = (E[]) new Object[entries.length * 2];
        System.arraycopy(entries, 0, temp, 0, entries.length);
        entries = temp;
    }

    /**
     * Removes and returns this stack's top entry.
     * Throws NoSuchElementException if the stack is empty.
     */
    @Override
    public E pop() {
        if (top == -1){
            throw new NoSuchElementException();
        }
        E temp = (E) Array.get(entries,top);
        Array.set(entries,top,null);
        top--;
        return temp;
    }

    /**
     * Returns the stack's top entry.
     * Throws NoSuchElementException if the stack is empty.
     */
    @Override
    public E peek() {
        E temp = (E) Array.get(entries,top);
        return temp;
    }

    /**
     * Returns true if the stack is empty.
     */
    @Override
    public boolean isEmpty() {
        boolean empty = false;

        if (top == -1){
            empty = true;
        }
        return empty;
    }

    /**
     * Removes all entries from the stack.
     */
    @Override
    public void clear() {
        for (int i = top; i >= 0; i-- ){
            Array.set(entries,i,null);
        }
        // TODO
    }

    /**
     * Returns the number of elements in the stack.
     */
    @Override
    public int size() {
        int count = 0;
        for (int i = top; i >= 0; i-- ){
            count++;
        }
            return count;
    }

}

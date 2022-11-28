package ex1astudent;


import java.util.NoSuchElementException;

public class DoubleLinkedQueue<E> implements QueueI<E> {

    private int count;

    private Node header;

    private Node trailer;

    public DoubleLinkedQueue(){
        header = new Node(null);
        trailer = new Node(null);
        header.next = trailer;
        trailer.previous = header;
    }
    @Override
    public void add(E entry) {
        Node newNode = new Node(entry);

        trailer.previous.next = newNode;
        newNode.next = trailer;
        newNode.previous = trailer.previous;
        trailer.previous = newNode;
        count++;
        System.out.println("Element " + entry + " added");
    }

    @Override
    public E remove() {
        Node removed = header.next;
        if (isEmpty()){
            throw new NoSuchElementException();
        }
        removed.next.previous = header;
        header.next = removed.next;
        count--;
        return removed.entry;
    }

    @Override
    public E element() {
        if (isEmpty()){
            throw new NoSuchElementException();
        }
        return header.next.entry;
    }

    @Override
    public boolean isEmpty() {
        if (count == 0){
            return true;
        }
        return false;
    }

    @Override
    public void clear() {
        header.next = trailer;
        trailer.previous = header;
        count = 0;
    }

    @Override
    public int size() {
        return count;
    }

    @Override
    public String toString() {
        Node node = header.next;
        StringBuilder sb = new StringBuilder();
        while (node != trailer){
            sb.append(node.entry.toString()).append(", ");
            node = node.next;
        }
        return sb.toString();
    }

    private class Node {
        private final E entry;
        private Node next;
        private Node previous;
        public Node(E entry) {
            this.entry = entry;
            this.next = null;
            this.previous = null;
        }
    }


}

package ex1astudent;


public class DoubleLinkedQueue<E> implements QueueI<E> {


    private Node header;

    private Node trailer;
    @Override
    public void add(E entry) {

    }

    @Override
    public E remove() {
        return null;
    }

    @Override
    public E element() {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public int size() {
        return 0;
    }

    private class Node {
        private String data;
        private DoubleLinkedQueue.Node next;
        private DoubleLinkedQueue.Node previous;
        public Node(String data) {
            this.data = data;
            this.next = null;
            this.previous = null;
        }
    }


}

package opgave2;

import opgave1.SortedLL;

import java.util.NoSuchElementException;

public class SortedDLL {

    private Node header;
    private Node trailer;

    public SortedDLL(){
        header = new Node(null);
        trailer = new Node(null);
        header.next = trailer;
        trailer.previous = header;
    }

    public void add(String s){
        Node newNode = new Node(s);

        Node node = header.next;

        while (node != trailer && node.data.compareTo(s) <= 0){
            node = node.next;
        }

        newNode.previous = node.previous;
        newNode.next = node;
        node.previous.next = newNode;
        node.previous = newNode;
    }

    public boolean removeLast(){
        Node remove = header.next;
        while (remove != trailer){
            if (remove.next == trailer){
                remove.next.previous = remove.previous;
                remove.previous.next = trailer;
                return true;
            }
            remove = remove.next;
        }
        return false;
    }

    public boolean remove(String s){
        Node node = header.next;

        while (node != trailer && !node.data.equals(s)){
            node = node.next;
            }

        if (node != trailer){
            node.next.previous = node.previous;
            node.previous.next = node.next;
            return true;
        }

        return false;
    }


    public void printElements(){
        Node node = header.next;
        while (node != trailer){
            System.out.println(node.data);
            node = node.next;
        }
    }

    public int count(){
        int count = 0;

        Node node = header.next;
        while (node != trailer){
            count++;
            node = node.next;
        }
        return count;
    }


    private class Node {
        private String data;
        private SortedDLL.Node next;
        private SortedDLL.Node previous;
        public Node(String data) {
            this.data = data;
            this.next = null;
            this.previous = null;
        }
    }
}

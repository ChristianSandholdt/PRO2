package opgave1;

import java.util.NoSuchElementException;

public class SortedLL {


    private Node first;


    public void add(String s){
        Node newNode = new Node(s);
        if (first == null){
            first = newNode;
            return;
        }
        Node node = first;

        if (first.data.compareTo(s) > 0){
            newNode.next = first;
            first = newNode;
            return;
        }

        if (node.next == null){
            if (node.data.compareTo(s) < 0){
                node.next = newNode;
            } else if (node.data.compareTo(s) >= 0){
                newNode.next = first;
                first = newNode;
            }
            return;
        }

        while (node.next != null && node.next.data.compareTo(s) <= 0){
                node = node.next;

        }
        newNode.next = node.next;
        node.next = newNode;
    }


    public boolean removeLast(){
        boolean found = false;
        Node node = first;
        if (first == null)
            throw new NoSuchElementException();

        if (first.next == null){
            first = null;
            found = true;
        }
        while (node.next != null){
            node = node.next;
            if (node.next.next == null){
                node.next = null;
                found = true;
            }
        }

        return found;
    }

    public boolean remove(String s){
        Node node = first;
        if (first == null){
            throw new NoSuchElementException();
        }

        if (first.data.equals(s)){
            first = first.next;
        }

        while (node.next != null && !node.next.data.equals(s)){
            node = node.next;
        }
        if (node.next != null){
            node.next = node.next.next;
        }
        return false;
    }

    public void printElements(){
        Node node = first;
        if (first == null){
            throw new NoSuchElementException();
        }
        System.out.println(node.data);
        while (node.next != null){
            node = node.next;
            System.out.println(node.data);
        }
    }

    public int count(){
        int count = 0;
        Node node = first;
        while (node != null){
            count++;
            node = node.next;
        }
        return count;
    }


    private class Node {
        private String data;
        private Node next;
        public Node(String data) {
            this.data = data;
            this.next = null;
        }
    }
}

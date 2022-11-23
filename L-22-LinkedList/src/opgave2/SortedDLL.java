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
        //If list empty
        if (header.next == trailer){
            header.next = newNode;
            newNode.next = trailer;
            trailer.previous = newNode;
            newNode.previous = header;
            return;
        }
        Node node = header.next;

        //Insert element before node bigger than newNode
        if (node.data.compareTo(s) > 0){

            node.previous.next = newNode;
            newNode.previous = node.previous;
            newNode.next = node;
            node.previous = newNode;
            System.out.println("test");
            return;
        }



        //If element bigger than all other elements
        if (node.next == trailer){
            if (node.data.compareTo(s) < 0){
                newNode.next = trailer;
                trailer.previous = newNode;
                newNode.previous = node;
                node.next = newNode;
            } else if (node.data.compareTo(s) >= 0){
                newNode.next = node;
                newNode.previous = node.previous;
                node.previous = newNode;
            }
            return;
        }

        while (node != trailer && node.data.compareTo(s) <= 0){
            node = node.next;
        }
        newNode.next = node.next;
        node.next = newNode;

    }

    public boolean removeLast(){
        if (trailer.previous != header){
            trailer.previous = trailer.previous.previous;
            trailer.previous.next = trailer;
            return true;
        }
        return false;
    }

    public boolean remove(String s){
        if (header.next == trailer){
            return false;
        }
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
        if (header.next == trailer){
            throw new NoSuchElementException();
        }
        Node node = header.next;
        while (node != trailer){
            System.out.println(node.data);
            node = node.next;
        }
    }

    public int count(){
        int count = 0;
        if (header == trailer){
            throw new NoSuchElementException();
        }

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

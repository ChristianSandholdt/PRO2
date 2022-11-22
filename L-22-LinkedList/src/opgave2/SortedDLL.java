package opgave2;

import opgave1.SortedLL;

public class SortedDLL {

    private Node header;
    private Node trailer;
    private Node first;

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
            newNode.next = header.next;
            newNode.previous = header;
            header.next = newNode;
            trailer.previous = newNode;
            return;
        }
        Node node = header.next;

        //If list size 1 and element smaller than current element
        if (node.data.compareTo(s) > 0){
            newNode.next = node;
            header.next = newNode;
            return;
        }

        //If element bigger than all other elements
        if (node.next == trailer){
            if (node.data.compareTo(s) < 0){
                node.next = newNode;
            } else if (node.data.compareTo(s) >= 0){
                newNode.next = node;
                node.previous = newNode;
            }
            return;
        }

        while (node.next != null && node.next.data.compareTo(s) <= 0){
            node = node.next;
        }
        newNode.next = node.next;
        node.next = newNode;

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

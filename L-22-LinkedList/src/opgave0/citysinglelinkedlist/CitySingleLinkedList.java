package opgave0.citysinglelinkedlist;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/**
 * Implementation of a list of Cities,
 * based on a singly-linked list.
 */
public class CitySingleLinkedList {
    // reference to the first city in the list
    private Node first;

    public CitySingleLinkedList() {
        first = null;
    }

    /**
     * Return the first city in the list.
     * Throw NoSuchElementException, if the list is empty.
     */
    public City getFirst() {
        if (first == null)
            throw new NoSuchElementException();

        return first.city;
    }

    /**
     * Remove the first element in the list.
     * Throw NoSuchElementException, if the list is empty.
     */
    public City removeFirst() {
        if (first == null)
            throw new NoSuchElementException();

        City city = first.city;
        first = first.next;
        return city;
    }

    /**
     * Add the city at the start of the list.
     */
    public void addFirst(City city) {
        Node newNode = new Node(city);
        newNode.next = first;
        first = newNode;
    }

    /**
     * Return the number of cities in the list.
     */
    public int count() {
        int count = 0;
        Node node = first;
        while (node != null) {
            count++;
            node = node.next;
        }
        return count;

    }

    /**
     * Remove the first occurrence of the city from the list.
     */
    public void removeCity(City city) {
        if (first == null)
            return;

        if (first.city.equals(city)) {
            first = first.next;
            return;
        }

        // update node to reference the node BEFORE the node
        // containing the city (if such a node exists)
        Node node = first;
        while (node.next != null && !node.next.city.equals(city)) {
            node = node.next;
        }
        if (node.next != null) {
            node.next = node.next.next;
        }
    }


    public int totalInhabitants(){
        if (first == null){
            throw new NoSuchElementException();
        }
        int sum = first.city.getInhabitants();
        Node node = first;
        while (node.next != null){
            node = node.next;
            sum += node.city.getInhabitants();
        }
        return sum;
    }

    //-----------------------------------------------------

    private static class Node {
        private final City city;
        private Node next;

        public Node(City city) {
            this.city = city;
            this.next = null;
        }
    }

    @Override
    public String toString() {
        Node node = first;
        StringBuilder sb = new StringBuilder("(");

        while (node != null){
            node = node.next;
            sb.append(node.city).append(", ");
        }
        return sb.toString();
    }
}

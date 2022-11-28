package ex1astudent;

import java.util.NoSuchElementException;

public class SingleLinkedQueue<E> implements QueueI<E> {
	// first points to the node at the front of the queue
	// (= the first node in the singly-linked list)
	private Node first;

	// last points to the node at the back of the queue
	// (= the last node in the singly-linked list)
	private Node last;

	private int queueSize;
	public SingleLinkedQueue() {
		first = null;
		last = null;
	}


	/**
	 * Add a new entry to the back of the queue.
	 * O(1)
	 */
	@Override
	public void add(E entry) {
		Node newNode = last;
		last = new Node(entry);
		last.entry = entry;
		last.next = null;
		if (isEmpty())
		{
			first = last;
		}
		else {
			newNode.next = last;
		}
		queueSize++;
		System.out.println("Element " + entry + " added");
	}

	/**
	 * O(1)
	 * Remove and return the entry at the front of the queue.
	 * Throw a NoSuchElementException(), if the queue is empty.
	 */
	@Override
	public E remove() {
		if (first == null){
			throw new NoSuchElementException();
		}
		first = first.next;

		queueSize--;
		return first.entry;
	}

	/**
	 * O(1)
	 * Return the entry at the front of the queue.
	 * Throw a NoSuchElementException(), if the queue is empty.
	 */
	@Override
	public E element() {
		if (first == null){
			throw new NoSuchElementException();
		}
		return first.entry;
	}

	/**
	 * O(1)
	 * Return true, if the queue is empty.
	 */
	@Override
	public boolean isEmpty() {
		return queueSize == 0;
	}

	/**
	 * O(1)
	 * Remove all entries from this queue.
	 */
	@Override
	public void clear() {
		first = null;
		last = null;
	}

	/**
	 * O(1)
	 * Return the number of elements in the queue.
	 */
	@Override
	public int size() {
		return queueSize;
	}

	@Override
	public String toString() {
		if (first == null || last == null){
			return "List empty";
		}
		return "SingleLinkedQueue{" +

				"first=" + first.entry +
				", last=" + last.entry +
				" Size = " + size() +
				'}';
	}

	//-------------------------------------------------------------------------

	private class Node {
		private E entry;
		private Node next;

		public Node(E entry) {
			this.entry = entry;
		}
	}
}

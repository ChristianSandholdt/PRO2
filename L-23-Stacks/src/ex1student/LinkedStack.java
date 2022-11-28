package ex1student;

import java.util.LinkedList;
public class LinkedStack<E> implements StackI<E> {
    // top of stack is at head of list (i.e.at first)
    private Node first;
    // the number of element in the stack
    int size;

    private final LinkedList linked;

    public LinkedStack() {
        linked = new LinkedList<>();
    }

    /**
     * Adds a new entry to the top of this stack.
     */
    @Override
    public void push(E entry) {
        linked.push(entry);
    }

    /**
     * Removes and returns this stack's top entry.
     * Throws NoSuchElementException, if the stack is empty.
     */
    @Override
    public E pop() {
        E object = (E) linked.peek();
        linked.pop();
        return object;
    }

    /**
     * Returns the stack's top entry.
     * Throws NoSuchElementException, if the stack is empty.
     */
    @Override
    public E peek() {
        return (E) linked.peek();
    }

    /**
     * Returns true if the stack is empty.
     */
    @Override
    public boolean isEmpty() {
        return linked.isEmpty();
    }

    /**
     * Removes all entries from the stack.
     */
    @Override
    public void clear() {
        linked.clear();
    }

    /**
     * Returns the number of elements in the stack.
     */
    @Override
    public int size() {
        return linked.size();
    }

    // Opgave 2
    @Override
    public boolean pController(E entry){
        for (int i = 0; i < entry.toString().length(); i++){
            char b = entry.toString().charAt(i);
            if (b == '(' || b == '{' || b == '['){
                linked.push(b);
            }
            if (linked.isEmpty()){
                return false;
            }
            char check;
            switch (b) {
                case ')' -> {
                    check = (char) linked.pop();
                    if (check == '{' || check == '[')
                        return false;
                }
                case '}' -> {
                    check = (char) linked.pop();
                    if (check == '(' || check == '[')
                        return false;
                }
                case ']' -> {
                    check = (char) linked.pop();
                    if (check == '(' || check == '{')
                        return false;
                }
            }
        }
        return true;
    }

    // Opgave 3
    @Override
    public boolean palindromeController(E entry){
        boolean palindrome = false;
        StringBuilder reversedEntry = new StringBuilder();
        for (int i = 0; i < entry.toString().length(); i++){
            char individualChars = entry.toString().charAt(i);
            linked.push(individualChars);
        }
        while(!linked.isEmpty()) {
            reversedEntry.append(linked.pop().toString());
        }
        if (reversedEntry.toString().equals(entry)){
            palindrome = true;
        }
        return palindrome;
    }

    @Override
    public int evaluate(String input){
        int answer;
        for (int i = 0; i < input.length(); i++){
            char individualElement = (input.charAt(i));
            int number;
            if (!(i == input.length() -1) && !Character.isSpaceChar(input.charAt(i + 1)) && Character.isDigit(individualElement)){
                String wholeNumber = Character.getNumericValue(individualElement) + "" + Character.getNumericValue(input.charAt(i + 1));
                number = Integer.parseInt(wholeNumber);
                linked.push(number);
                i = i + 2;
            } else if (Character.isDigit(individualElement)){
                number = (Character.getNumericValue(individualElement));
                linked.push(number);
                i++;
            } else {
                i++;
            }
            if (individualElement == '+'){
                int n1 = (int) linked.pop();
                int n2 = (int) linked.pop();
                int calculated = n1 + n2;
                linked.push(calculated);
            } else if (individualElement == '-'){
                int n1 = (int) linked.pop();
                int n2 = (int) linked.pop();
                int calculated = n2 - n1;
                linked.push(calculated);
            } else if (individualElement == '*'){
                int n1 = (int) linked.pop();
                int n2 = (int) linked.pop();
                int calculated = n1 * n2;
                linked.push(calculated);
            } else if (individualElement == '/'){
                int n1 = (int) linked.pop();
                int n2 = (int) linked.pop();
                int calculated = n2 / n1;
                linked.push(calculated);
            }
        }
        answer = (int) linked.pop();
        return answer;
    }

    //-------------------------------------------------------------------------

    private class Node {
        private final E entry;
        private Node next;

        public Node(E entry) {
            this.entry = entry;
            this.next = null;
        }
    }

}

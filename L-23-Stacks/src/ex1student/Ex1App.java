package ex1student;

public class Ex1App {

    public static void main(String[] args) {
        //StackI<String> s = new DequeStack<>();
        //StackI<String> s = new ArrayStack<>();
        StackI<String> s = new LinkedStack();
        s.push("Tom");
        s.push("Diana");
        s.push("Harry");
        s.push("Thomas");
        s.push("Bob");
        s.push("Brian");
        System.out.println(s.peek());
        System.out.println(s.isEmpty() + " " + s.size());
        System.out.println();

        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
        System.out.println();

        System.out.println(s.isEmpty() + " " + s.size());
        System.out.println();

        // -------- test of reverse --------

        Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        reverse(numbers);
        for (Integer number : numbers) {
            System.out.print(number + " ");
        }

        System.out.println("\n");

        //Opgave 2
        // --------- test bracket check ----------
        StackI<String> bracketsBalanced = new LinkedStack();
        System.out.print("Expected: Balanceret. Result = ");
        if (bracketsBalanced.pController("(3+{5[99 {*}]}[23[{67}67]])")) {
            System.out.println("Balanceret");
        } else {
            System.out.println("Ikke Balanceret");
        }

        StackI<String> bracketsUnbalanced = new LinkedStack();
        System.out.print("Expected: Ikke Balanceret. Result = ");
        if (bracketsUnbalanced.pController("(}){")) {
            System.out.println("Balanceret");
        } else {
            System.out.println("Ikke Balanceret");
        }

        System.out.println();

        //Opgave 3
        // --------- test bracket check ----------
        StackI<String> palindrome = new LinkedStack();
        System.out.print("Expected: True. Result = ");
        System.out.println(palindrome.palindromeController("ABCDEFGFEDCBA"));

        StackI<String> notPalindrome = new LinkedStack();
        System.out.print("Expected: False. Result = ");
        System.out.println(notPalindrome.palindromeController("ABCCA"));

        System.out.println();

        //Opgave 4
        StackI<String> polishReversedNotation = new LinkedStack();
        System.out.print("Expected: 10. Result = ");
        System.out.println(polishReversedNotation.evaluate("12 2 5 + - 4 * 2 /"));

        StackI<String> polishReversedNotationFucked = new LinkedStack();
        System.out.print("Expected: 2452. Result = ");
        System.out.println(polishReversedNotation.evaluate("1233 2 5 + - 4 * 2 /"));
    }

    public static <E> void reverse(E[] table) {
        StackI<E> stack = new ArrayStack<E>(table.length);
        // StackI<E> stack = new LinkedStack<E>();
        //StackI<E> stack = new DequeStack<>();
        for (E e : table) {
            stack.push(e);
        }
        int i = 0;
        while (!stack.isEmpty()) {
            table[i] = stack.pop();
            i++;
        }
    }

}
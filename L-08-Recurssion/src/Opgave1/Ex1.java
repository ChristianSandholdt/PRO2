package Opgave1;

public class Ex1 {


    public static int factorial(int n){
        int result;
        if (n == 0 || n == 1){
            return 1;
        }
        else {
            result = n * factorial(n-1);
        }
        return result;
    }

    public static void main(String[] args) {
        for (int i = 10; i > 0; i--){
            System.out.println(factorial(i));
        }
    }


}

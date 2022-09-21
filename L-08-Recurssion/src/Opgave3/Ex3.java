package Opgave3;

public class Ex3 {

    /**
     *
     * @param a >= 0
     * @param b >= 0
     * @return
     */
    public static int prod(int a, int b){
        if (a > 1){
            return b+prod(a-1,b);
        }
        else if (a == 1){
            return b;
        }
        return 0;
    }

    public static int prodRus(int a, int b){
        if (a>0){
            if (a%2 == 0){
                return prodRus(a/2,b+b);
            }
            else
                return prodRus(a-1,b)+b;
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(prod(5,5));

        System.out.println(prodRus(5,5));
    }
}

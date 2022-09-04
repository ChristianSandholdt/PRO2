package Opgave2;

public class Family {


    /*
     * Returns the total payment for a family minus discount
     * Pre: small >= 0, big >= 0
     * (small is the number of preschool children
     * and big is the number of children attending school)
     */
    public int totalPayment (int small, int big){
        int payment = 0;
        int discount = 0;
        if (small + big == 1){
            payment = small*2000 + big*1000;
        }
        if (small + big <=3){
            if (small == 1 && big == 1 || big == 2){
                payment = 1000 + big*1000;
            }
        }
        if (small + big <= 3){
            if (small == 2 && big == 1 || small == 2 && big == 0){
                payment = 3000 + big*1000;
            }
        }
        if (small == 2 || small == 3){
            payment = small*2000-1000;
        }
        if (small + big <= 3){
            if (small == 0 && big == 2 || big == 3){
                payment = big*1000-500;
            }
        }

        return payment;
    }
}

package Opgave2;

import java.util.ArrayList;
import java.util.List;

public class Ex2 {

    private static int zeroes = 0;

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(List.of(1,2,0,3,4,5,6,7,8,9,10,11,0,0,0));
        System.out.println(countZeroes(list,list.get(0),list.size()-1));
    }

    public static int countZeroes(ArrayList<Integer> list, int l, int h){
        if (l == h){
            return list.get(l) == 0 ? zeroes++ : 0;
        } else {
            int m = (l+h) / 2;
            countZeroes(list,l,m);
            countZeroes(list,m+1,h);

        }
        return zeroes;
    }
}

package Opgave1;

import java.util.ArrayList;
import java.util.List;

public class Ex1 {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9,10,11));
        System.out.println(allElements(list,list.get(0),list.size()-1));
    }


    public static int allElements(ArrayList<Integer> list, int l, int h){
        int sum;
        if (l == h){
            return list.get(l);
        } else {
            int m = (l+h) / 2;
            int low = allElements(list,l,m);
            int high = allElements(list,m+1,h);
            sum = low + high;
        }
        return sum;
    }










//    public static int allElements(ArrayList<Integer> list, int l, int h){
//        int sum = 0;
//        if (l == h){
//            return list.get(l);
//        } else {
//            int m = (l + h) / 2;
//            int sumLow = 0;
//            int sumHigh = 0;
//            for (int i = 0; i < m; i++){
//                 sumLow += list.get(i);
//            }
//            for (int i = m; i < h; i++){
//                sumHigh += list.get(i);
//            }
//            sum = sumHigh + sumLow;
//        }
//        return sum;
//    }


//    public static int allElements(ArrayList<Integer> list, int l, int h){
//        ArrayList<Integer> high = new ArrayList<>();
//        ArrayList<Integer> low = new ArrayList<>();
//        int sum = 0;
//        if (l == h){
//            return list.get(l);
//        } else {
//            int m = (l + h) / 2;
//            int sumLow = 0;
//            int sumHigh = 0;
//            for (int i = 0; i < m; i++){
//                low.add(list.get(i));
//            }
//            for (int i = m; i < h; i++){
//                high.add(list.get(i));
//            }
//
//            for (Integer integer : low) {
//                sumLow += integer;
//            }
//
//            for (Integer integer : high) {
//                sumHigh += integer;
//            }
//
//            sum = sumHigh + sumLow;
//        }
//        return sum;
//    }

}

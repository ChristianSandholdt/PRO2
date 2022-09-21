package Opgave3;

import java.util.ArrayList;
import java.util.List;

public class Ex3 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(List.of(8,56,45,34,15,12,34,44));
        mergeSort(list);
        System.out.println(list);
    }
    private static void mergesort(ArrayList<Integer> list, int l, int h) {
        if (l < h) {
            int m = (l + h) / 2;
            mergesort(list, l, m);
            mergesort(list, m + 1, h);
            merge(list, l, m, h);
        }
    }

    private static void merge(ArrayList<Integer> list, int low, int middle, int high) {
        ArrayList<Integer> temp = new ArrayList<>();
        mergesort(list,low,middle);
        mergesort(list,middle+1,high);

    }

    public static void mergeSort(ArrayList<Integer> list){
        mergesort(list, list.get(0), list.size()-1);
    }

}

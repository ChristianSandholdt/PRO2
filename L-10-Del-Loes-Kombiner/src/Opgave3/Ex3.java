package Opgave3;

import java.util.ArrayList;
import java.util.List;

public class Ex3 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(List.of(8,56,45,34,15,12,34,44));



        mergesort(list, 0, list.size()-1);
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

        int i = low;
        int j = middle + 1;

        while (i <= middle && j <= high) {
            if (list.get(i) <= list.get(j)) { // Hvis venstre sides tal er det mindste tilføjes det til listen og tælles op
                temp.add(list.get(i));
                i++;
            } else { //Højre sides tal må være mindst og det tilføjes til listen og tælles op
                temp.add(list.get(j));
                j++;
            }
        }


        //En af listerne tømmes før den anden uanset hvad.
        //Nedenstående tømmer den sidste liste
        while (i <= middle) {
            temp.add(list.get(i));
            i++;
        }

        while (j <= high) {
            temp.add(list.get(j));
            j++;
        }

        //Fyld fra den midlertidige liste over i den liste vi har inputtet
        //Plus low med k for at indexene følges ad og det rigtige bliver indsat

        for (int k = 0; k < temp.size(); k++) {
            list.set(low+k, temp.get(k));


        }

    }

}

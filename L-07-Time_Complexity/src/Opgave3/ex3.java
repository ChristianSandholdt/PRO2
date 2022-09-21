package Opgave3;

import java.util.Arrays;

public class ex3 {


    public static void main(String[] args) {
        int[] ints = {5,10,5,6,4,9,8};

        System.out.println(Arrays.toString(prefixAverage(ints)));

    }

    public static double[] prefixAverage(int[] input){
        double[] result = new double[input.length];
        double sum = 0;
        for (int i = 0; i < input.length; i++){
            sum += input[i];
            result[i] = sum / (1 + i);
        }
        return result;
    }

}

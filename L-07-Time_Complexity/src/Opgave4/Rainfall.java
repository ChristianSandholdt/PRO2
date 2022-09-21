package Opgave4;

public class Rainfall {
        private final int[] weeklyRainfall = {
                20, 10, 12, 12, 13, 14, 15, 10, 8, 7, 13, 15, 10,
                9, 6, 8, 12, 22, 14, 16, 16, 18, 23, 12, 0, 2,
                0, 0, 18, 0, 0, 0, 34, 12, 34, 23, 23, 12, 44,
                23, 12, 34, 22, 22, 22, 22, 18, 19, 21, 32, 24, 13};


    public static void main(String[] args) {
        Rainfall rain = new Rainfall();
        System.out.println("A");
        System.out.println(rain.minRainfall3());
        System.out.println("B");
        System.out.println(rain.minRainfallN(3));
    }
        /**
         * Return the week number of the first week
         * in the period of 3 weeks with the least rainfall.
         */
        public int minRainfall3() {
            int sum = 10000;
            int temp = 0;
            for (int i = 0; i < weeklyRainfall.length-2; i++){
                if (weeklyRainfall[i] + weeklyRainfall[i+1] + weeklyRainfall[i+2] < sum){
                    sum = weeklyRainfall[i] + weeklyRainfall[i+1] + weeklyRainfall[i+2];
                    temp = i + 1; //Grundet indekseringen starter på 0 men der findes ikke en uge 0
                }
            }
            return temp;
        }
        /**
         * Return the week number of the first week
         * in the period of n weeks with the least rainfall.
         */
        public int minRainfallN(int n) {
            int sum = 100;
            int index = 0;
            for (int i = 0; i < weeklyRainfall.length-(n-1); i++){
                int temp = 0;
                for (int j = i; j < i + n; j++){
                    temp += weeklyRainfall[j];
                    if(temp < sum){
                        sum = temp;
                        index = i + 1;
                    }
                }
            }
            return index;
        }
        /**
         *  Return the week number of the first week in the longest period,
         *  where the rainfall has been exactly the same each week.
         */
        public int sameRainfall() {
            // TODO
            return 0;
        }


}

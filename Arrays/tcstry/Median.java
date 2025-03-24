package tcstry;

import java.util.Arrays;

public class Median {
    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5, 6 };

        Arrays.sort(a);
        double median = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                median = (a.length) + (a.length + 1) / 2;
            }
            else{
                median=a.length/2;
            }
        }
        System.out.println(median);
    }

}

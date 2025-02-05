package update;

import java.util.Scanner;

public class updateAtAny {
    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40 };

        Scanner sc = new Scanner(System.in);
        System.out.println("ener index where  you want to update");
        int index = sc.nextInt();
        System.out.println("ener number which you want to update");
        int element = sc.nextInt();

        arr[index] = element;


        // display updated arr
        for (int d : arr) {
            System.out.println(d);
        }
    }
}

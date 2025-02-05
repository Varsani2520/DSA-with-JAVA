package update;

import java.util.Scanner;

public class updateAtEnd {
    public static void main(String[] args) {

        int arr[] = { 10, 20, 30, 40 };
        
        // get input for which elemnt
        Scanner sc = new Scanner(System.in);
        System.out.println("ener number which you want to update");
        int element = sc.nextInt();

       
                arr[arr.length-1] = element;
            
        
        // display updated arr
        for (int d : arr) {
            System.out.println(d);
        }
    }

}

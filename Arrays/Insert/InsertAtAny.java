package Insert;
import java.util.Scanner;

public class InsertAtAny {
    public static void main(String[] args) {
        int arr[] = new int[4];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;

        // get position and element from user
        Scanner sc = new Scanner(System.in);
        System.out.println("which position you want to add element:");
        int pos = sc.nextInt();
        System.out.println("which elemnt you want to add:");
        int element = sc.nextInt();

        // neww array with one extra size
        int newarr[] = new int[arr.length + 1];

        // insert element at new array
        for (int i = 0, j = 0; i < newarr.length; i++) {
            if (i == pos) {
                newarr[i] = element;
            } else {
                newarr[i] = arr[j];
                j++;
            }
        }
        // display array
        for (int newarry : newarr) {
            System.out.println(newarry);
        }
    }
}
// j used to iterate over the original array
// i used to iterate over the new array
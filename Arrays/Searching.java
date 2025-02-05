import java.util.Scanner;

public class Searching {
    public static void main(String[] args) {


        int array[] = { 30, 40, 45, 80 };
        // search element in array
        Scanner sc = new Scanner(System.in);
        int searchNumber = sc.nextInt();

        for (int i = 0; i < array.length; i++) {
            if (array[i] == searchNumber) {
                System.out.println("seach element found");
                break;
            } else {
                System.out.println("Search not found ");
                break;
            }
        }
    }
}

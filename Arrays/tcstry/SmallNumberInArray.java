package tcstry;

public class SmallNumberInArray {
    public static void main(String[] args) {
        int a[] = { 10, 3, 4, 9 };

        int smallest = a[0];

        // for (int i = 0; i < a.length; i++) {
        //     if (a[i] < smallest)
        //         smallest = a[i];
        // }
        // System.out.println(smallest);
        for (int n : a) {
            if (n < smallest)
                smallest = n;
        }
        System.out.println(smallest);
    }
}

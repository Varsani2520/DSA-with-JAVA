import java.util.Scanner;

class Functions {
    // print name function
    public static void printName(String name) {
        System.out.println(name);
        return;
    }

    // add two number sum
    public static int sum(int n1, int n2) {
        return n1 + n2;
    }

    public static void fact(int n) {
        int factorial = 1;
        if (n < 0) {
            System.out.println("invalid");
            return;
        }
        for (int i = n; i >= 1; i--) {
            factorial = factorial * i;
        }
        System.out.println(factorial);
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // String name = sc.next();
        // printName(name); // call name function

        int n1 = sc.nextInt();
        // int n2 = sc.nextInt();
        // int sum = sum(n1, n2);
        // System.out.println("sumof two nuber is:" + sum);
        fact(n1);
    }
}
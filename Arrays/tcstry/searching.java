package tcstry;

import java.util.Scanner;

public class searching {
    public static void main(String[] args) {
        int a[] = {9,10,22,54 };
        Scanner sc = new Scanner(System.in);
        int searchElement = sc.nextInt();
        sc.close();
        Boolean f=false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == searchElement) {
                System.out.println("found");
              f=true;
              break;
            }
            
        }
        if(!f){
            System.out.println("not found");
        }
       

    }
}

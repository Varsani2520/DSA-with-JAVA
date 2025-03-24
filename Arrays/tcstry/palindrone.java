package tcstry;

public class palindrone {
    public static void main(String[] args) {
        int num = 12321;

        int temp = num;
        int reversed = 0;

        while (temp != 0) {
            int lastdigit = temp % 10;
            System.out.println(lastdigit);
            temp /= 10;
            System.out.println(temp);
            reversed = reversed * 10 + lastdigit;
            System.out.println(reversed);
        }
        System.out.println(reversed == num);
    }
}

package tcstry;

public class armstrong {
    public static void main(String[] args) {
        int numer = 153;

        int sum = 0;
        int temp = numer;

        while (temp != 0) {
            int lastdigit=temp%10;
            System.out.println(lastdigit);
            temp = temp / 10;
            System.out.println(temp);
            sum += (lastdigit* lastdigit*lastdigit);
            System.out.println(sum);
        }
        if (sum == numer) {
            System.out.println("yes");
        } else {
            System.out.println("n0");
        }
    }
}

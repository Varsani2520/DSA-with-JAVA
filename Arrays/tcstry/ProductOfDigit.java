package tcstry;

public class ProductOfDigit {
    public static void main(String[] args) {
        int number=321;
int temp=number;
int product=1;
        while(temp!=0){
            int lastdigit=temp%10;

            temp=temp/10;

            product*=(lastdigit);
        }

        System.out.println(product);
    }
}

package Insert;
public class InsertAtBegining {
    public static void main(String[] args) {
        // insert element at begining of the array

        int initialarray[] = new int[5];
        initialarray[0] = 10;
        initialarray[1] = 20;
        initialarray[2] = 30;
        initialarray[3] = 40;
        initialarray[4] = 50;

        int newarray[] = new int[initialarray.length + 1];
        newarray[0] = 100;

        for (int i = 0; i < initialarray.length; i++) {
            newarray[i + 1] = initialarray[i];
        }

        // print new array
        for (int n : newarray) {
            System.out.print(n + " " + "\n");
        }
    }
}

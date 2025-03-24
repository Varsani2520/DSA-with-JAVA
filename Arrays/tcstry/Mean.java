package tcstry;

public class Mean {
    public static void main(String[] args) {
        int n[] = {1, 2, 3, 4, 5, 6};  // Array of numbers
        
        int sum = 0;
        for (int i = 0; i < n.length; i++) {
            sum += n[i]; 
        }

        double mean = (double) sum / n.length;  // Correct mean calculation
        System.out.println("Mean: " + mean);
    }
}

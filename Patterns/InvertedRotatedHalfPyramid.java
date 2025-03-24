public class InvertedRotatedHalfPyramid {
    void Solution() {
        int m = 4;
        for (int i = 0; i < m; i++) {
            // for spacing
            for (int j = 0; j < m - i; j++) {
                System.out.print(" ");
            }
            // for star
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        InvertedRotatedHalfPyramid i = new InvertedRotatedHalfPyramid();
        i.Solution();
    }
}

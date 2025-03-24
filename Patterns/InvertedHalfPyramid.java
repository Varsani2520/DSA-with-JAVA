public class InvertedHalfPyramid {
    void Solution() {
        int n = 4;
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("\n");
        }
    }

    public static void main(String[] args) {
        InvertedHalfPyramid h = new InvertedHalfPyramid();
        h.Solution();
    }
}

public class NumberPyramid {
    void Solution() {
        int m = 5;
        for (int i = 1; i <= m; i++) {
            // spaces
            for (int j = 1; j <= m-i; j++) {
                System.out.print(" ");
            }
            // first half pyramid
            for (int j = i; j >=1; j--) {
                System.out.print(j);
            }
            for(int j=2;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        NumberPyramid h = new NumberPyramid();
        h.Solution();
    }
}

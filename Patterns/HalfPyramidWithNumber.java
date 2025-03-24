public class HalfPyramidWithNumber {
    void Solution() {
        int m = 4;
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(j + 1);
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        HalfPyramidWithNumber h = new HalfPyramidWithNumber();
        h.Solution();
    }
}

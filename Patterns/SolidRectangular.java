
class SolidRectangular {
    void Solution() {
        int m = 4, n = 5;
        // outer loop =rows=4
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println("\n");
        }
    }

    public static void main(String[] args) {
        SolidRectangular s = new SolidRectangular();
        s.Solution();
    }
}
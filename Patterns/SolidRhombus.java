public class SolidRhombus {
    void Solution() {
        int m = 5;
        for (int i = 0; i <= m; i++) {
            // space
            for (int j = 0; j < m-i; j++) {
                System.out.print(" ");
            }
            // for star
            for (int j = 0; j <=5; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        SolidRhombus h = new SolidRhombus();
        h.Solution();
    }
}

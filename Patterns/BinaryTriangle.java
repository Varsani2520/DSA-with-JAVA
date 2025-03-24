public class BinaryTriangle {
    void Solution() {
        int m = 4;
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= i; j++) {
                int sum = i + j;
                if (sum % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        BinaryTriangle h = new BinaryTriangle();
        h.Solution();
    }
}

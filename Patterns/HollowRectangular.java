public class HollowRectangular {
    void Solution() {
        int m = 4, n = 5;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 | i==3| j==0 | j==4) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println("\n");
        }
    }

    public static void main(String[] args) {
        HollowRectangular h = new HollowRectangular();
        h.Solution();

    }
}

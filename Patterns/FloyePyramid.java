public class FloyePyramid {
    void Solution() {
        int m = 4,numbers=1;
        
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(numbers+" ");
                numbers++;
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        FloyePyramid h = new FloyePyramid();
        h.Solution();
    }
}

package delete;
public class DeleteAtBegin {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int[] newArr = new int[arr.length - 1];



        for(int i=1;i<arr.length;i++) {
            newArr[i-1] = arr[i];
        }

        // display
        for(int i:newArr) {
            System.out.print(i + " ");
        }
    }
}

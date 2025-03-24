

public class Selection {
    public static void main(String[] args) {
        int arr[] = { 8, 90, 3, 2, 99 };
        int temp;
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minIndex] > arr[j]) {
                    minIndex = j;
                }
            }
            temp = arr[minIndex];
            arr[minIndex]=arr[i];
            arr[i]=temp;
        }

        // display sorted array
        for(int i:arr){
            System.out.println(i+" ");
        }
    }
}

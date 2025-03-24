public class Counting {
    public static void main(String[] args) {
        int arr[] = { 2, 1, 1, 0, 2, 5, 4, 0, 2, 8, 7, 7, 9, 2 };
        int output[] = new int[arr.length];
        // display before array
        System.out.print("Before sorting:");
        for (int before : arr) {
            System.out.print(before + " ");
        }
        System.out.println();

        // find the max element of the array
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        // initialize the count array
        int count[] = new int[max + 1];

        // store count of each element
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
        for (int after : count) {
            System.out.print(after + " ");
        }
        System.out.print("\n");
        // add with next pos
        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }

        for (int after : count) {
            System.out.print(after + " ");
        }
        System.out.print("\n");

        for (int i = arr.length - 1; i >= 0; i--) {
            output[count[arr[i]] - 1] = arr[i];
            count[arr[i]]--;
        }
        // display after array
        System.out.print("after sorting:");
        for (int after : output) {
        System.out.print(after + " ");
        }
    }
}

package delete;
class DeleteAtEnd {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int[] newArr = new int[arr.length - 1];

        for(int i=0;i<arr.length-1;i++) {
            newArr[i] = arr[i];
        }

        // display
        for(int i=0;i<newArr.length;i++) {
            System.out.print(newArr[i] + " ");
        }
    }
}
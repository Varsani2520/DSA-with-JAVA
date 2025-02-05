package delete;

class DeleteAtAny {
    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 50 };
        int pos = 2;

        int newarr[] = new int[arr.length - 1];

        for (int i = 0, j = 0; i < newarr.length; i++, j++) {
            if (j == pos) {
                j++; // skip the element at that position

            }
            newarr[i] = arr[j];

        }
        // display the new array
        for (int d : newarr) {
            System.out.println(d);
        }
    }
}

// i track the index of new arr
// j track the index of origional arr
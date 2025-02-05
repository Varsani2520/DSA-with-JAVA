public class Travelling {
    public static void main(String[] args) {
        // Declaration of array
        int a[];

        // initialization of array
        a = new int[5];

        // declare + initialize
        int num[] = { 10, 20, 30, 40, 50 };

        // acess element
        System.out.println("acessing the element:" + num[2]);

        // update the array of elemnt at index of 3
        num[3] = 45;
        System.out.println("update array element at index of 3:" + num[3]);

        // travelling of element in arrays[read]
        int array[] = { 30, 40, 45, 80 };
        for (int i = 0; i < array.length; i++) {
            System.out.println("traveling of arrays at index" + i + array[i]);
        }

        // reverse travelling
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println("reverse traveling of arrays at index" + i + array[i]);
        }
    }
}

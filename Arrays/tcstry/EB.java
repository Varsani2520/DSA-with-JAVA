package tcstry;

public class EB {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int[] newArr = new int[arr.length];
arr[0]=45;
        for(int i=0;i<arr.length;i++){
            newArr[i]=arr[i];
        }  
     // display
     for(int i:newArr) {
        System.out.print(i + " ");
    }
    
    }
}

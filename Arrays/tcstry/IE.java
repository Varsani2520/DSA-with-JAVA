package tcstry;

public class IE {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int[] newArr = new int[arr.length +1];

        
        for(int i=0;i<arr.length;i++){
            newArr[i]=arr[i];
        }
        
        newArr[arr.length]=45;
        
        for(int i:newArr){
            System.out.println(i);
        }
    }
}

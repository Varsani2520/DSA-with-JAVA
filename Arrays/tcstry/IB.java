package tcstry;

public class IB {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int newArr[]=new int[arr.length+1];

        newArr[0]=22;

        for(int i=0;i<arr.length;i++){
            newArr[i+1]=arr[i];
        }

        for(int i:newArr){
            System.out.println(i);
        }
    }
}

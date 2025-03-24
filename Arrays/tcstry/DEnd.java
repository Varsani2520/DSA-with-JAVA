package tcstry;

public class DEnd {
    public static void main(String[] args) {
        int a[]={1,10,3,4};
        int newArr[]=new int[a.length-1];

        for(int i=0;i<a.length-1;i++){
            newArr[i]=a[i];
        }
        for(int j:newArr){
            System.out.println(j);
        }
    }
}

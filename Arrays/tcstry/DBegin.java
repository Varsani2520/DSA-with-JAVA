package tcstry;

public class DBegin {
    public static void main(String[] args) {
        
        int a[]={1,2,3,4,5};
        int newarr[]=new int[a.length-1];
    
    
        for(int i=1;i<a.length;i++){
    newarr[i-1]=a[i];
        }

        for(int i:newarr){
            System.out.println(i);
        }
    }
}

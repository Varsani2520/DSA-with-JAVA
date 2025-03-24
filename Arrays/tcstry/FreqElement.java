package tcstry;

public class FreqElement {
    public static void main(String[] args) {
        int a[]={1,1,2,3,2,2,4,21,1,1,2,2,2};
int frenum=a[0];
int freq=1;
        for(int i=0;i<a.length;i++){
if(a[i]>frenum){
    frenum=a[i];
    freq++;
}
        }
System.out.println(frenum);
 }
}

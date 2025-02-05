package Insert;
public class InsertAtEnd {
 public static void main(String[] args) {
     // insert at end of the array
     int iarray[] = new int[5];
     iarray[0] = 10;
     iarray[1] = 20;
     iarray[2] = 30;
     iarray[3] = 40;
     iarray[4] = 50;

     int narray[] = new int[iarray.length + 1]; // new array with 1 extra space
     // copy element from iarr to new array
     for (int i = 0; i < iarray.length; i++) {
         narray[i] = iarray[i];
     }
     // insert new element at the end
     narray[iarray.length] = 100;
     // display new array
     for (int n : narray) {
         System.out.print(n + " ");
     }

 }   
}

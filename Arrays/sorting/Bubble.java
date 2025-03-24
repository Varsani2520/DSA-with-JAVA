class Insertions{
    public static void main(String args[]){
        int arr[]={1,3,2,2,6,2};
        int temp;

        for (int i=0;i<arr.length;i++){
            int minIndex=i;
            for (int j=i+1;j<arr.length;j++){
                if(arr[minIndex]>arr[j]){
                    temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }



        for(int d:arr){
            System.out.println(d);
        }

}
}
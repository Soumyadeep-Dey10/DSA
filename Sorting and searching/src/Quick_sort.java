public class Quick_sort {
     static int partition(int[] arr,int low,int high){

         int pivot=arr[low];
         int i=low;
         int j=high;

         while(i<j) {
             do {
                 i++;
             } while (arr[i] <= pivot);

             do {
                 j--;
             } while (arr[j] > pivot);

             if(i<j)
             {
                 int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
             }
         }
             int temp = arr[j];
             arr[j] = arr[low];
             arr[low] = temp;

         return j;
     }
     public static void sort(int[] arr,int low,int high){
         if(low<high){
             int j=partition(arr,low,high);
             sort(arr,low,j);
             sort(arr,j+1,high);
         }
     }
    public static void main(String[] args) {
    int[] arr={4,10,99,-70,100};
    sort(arr,0,arr.length-1);
    for(int i:arr){
        System.out.print(i+" ");
    }
    }
}

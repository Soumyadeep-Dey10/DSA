import java.util.Arrays;

public class Bubble_Sort {
    public static void main(String[] args) {
        int[] arr = {10, 1, -8, 100, 9};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubble(int[] arr) {
        int n = arr.length;
       boolean swapped;
//       for(int i=0 ;i<n;i++){
//           swapped=false;
//           for(int j=0;j<n-i-1;j++){
//               if(arr[j]>arr[j+1]){
//                   int temp=arr[j];
//                   arr[j]=arr[j+1];
//                   arr[j+1]=temp;
//                   swapped=true;
//               }
//           }
//           if(!swapped) break;
//       }

        for(int i = 0; i < n; i++){
            swapped = false;
            for(int j = 0; j < n-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp= arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped) break;
        }
    }
}

import java.util.Arrays;

public class Insertion_sort {
    public static void main(String[] args) {
        int[] arr = {4, 5, 8, 10, -80};
//        for(int i=1;i<arr.length;i++){
//            int j=i-1;
//            int x=arr[i];
//            while (j>-1 && arr[j]>x){
//                arr[j+1] =arr[j];
//                j--;
//            }
//            arr[j+1]=x;
//        }
        for(int i = 1; i < arr.length; i++){
            int j = i - 1;
            int x = arr[i];
            while(j > -1 && arr[j] > x){
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = x;
        }
        System.out.println(Arrays.toString(arr));
    }
}

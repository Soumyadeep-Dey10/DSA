import java.util.Arrays;

public class Selection_sort {
    public static void main(String[] args) {
        int[] arr = {10, 1, -8, 100, 9};
//        for(int i = 0;i< arr.length;i++){
//            int min_index = i;
//            for(int j=i;j< arr.length;j++){
//                if(arr[j] < arr[min_index]){
//                    min_index=j;
//                }
//            }
//            int temp = arr[min_index];
//            arr[min_index] = arr[i];
//            arr[i] = temp ;
//        }
        for(int i = 0; i < arr.length; i++){
            int min_index = i;
            for(int j = i + 1; j < arr.length; j++){
                if(arr[j] < arr[min_index]){
                    min_index = j;
                }
            }
            int temp = arr[min_index];
            arr[min_index] = arr[i];
            arr[i] = temp ;
        }
        System.out.println(Arrays.toString(arr));
    }
}

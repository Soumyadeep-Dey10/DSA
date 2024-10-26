package Cheatsheet;

import java.util.Arrays;

public class LinearSearch {

    public static boolean binarySearch(int[] arr, int target){
        Arrays.sort(arr);
        int low = 0, high = arr.length-1;
        while (low <= high){
            int mid = (low + high)/ 2;
            if(arr[mid] == target){
                return true;
            }
            else if(target > arr[mid]){
                low = mid + 1;
            }
            else {
                high = mid -1 ;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {5, 2, 4, 1, 3};
        System.out.println(binarySearch(arr, 2));
    }
}

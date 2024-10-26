package Cheatsheet;

import java.util.Arrays;

public class KthLargestElement {
    public static int findLargest(int[] arr, int k){
        if (arr.length == 0) return 0;
        Arrays.sort(arr);
        return arr[arr.length - k];
    }
    public static void main(String[] args) {
        int[] ar= {3,2,1,5,6,4};
        System.out.println(findLargest(ar, 1));
    }
}

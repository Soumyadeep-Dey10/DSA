package Cheatsheet;

import java.util.Arrays;

public class MergeArray {
    public static int[] merge(int[] arr1, int[] arr2){
        int n = arr1.length + arr2.length;
        int[] res = new int[n];
        int i = 0, j = 0, k = 0;
        while (i < arr1.length && j < arr2.length){
            if(arr1[i] <= arr2[j]){
            res[k] = arr1[i];
            i++;
        }else {
                res[k] = arr2[j];
                j++;
            }
            k++;
        }
        if(i < arr1.length){
            res[k++] = arr1[i++];
        }
        if(j < arr2.length){
            res[k++] = arr2[j++];
        }
        return res;
    }
    public static void main(String[] args) {
        int[] array1 = {1, 3, 5, 7};
        int[] array2 = {2, 4, 6, 8};
        int[] result = merge(array1, array2);
        System.out.println(Arrays.toString(result));
    }
}

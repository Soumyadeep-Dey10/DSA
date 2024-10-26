package Cheatsheet;

import java.util.Arrays;

public class Twosum {
    public static int[] findPair(int[] arr, int target){
        int[] res = new int[2];
        for (int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                if (arr[i] + arr[j] == target){
                    res[0] = i;
                    res[1] = j;
                }
            }
        }
        return res;
    }
    public static void main(String[] args) {
       int[] nums = {2,7,11,15};
       int target = 9;
       int[] res = findPair(nums, target);
        System.out.println(Arrays.toString(res));
    }
}

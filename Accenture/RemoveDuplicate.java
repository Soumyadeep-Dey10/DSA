package Cheatsheet;

//Input: nums = [0,0,1,1,1,2,2,3,3,4]
//Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
//Input: nums = [1,1,2]
//Output: 2, nums = [1,2,_]


import java.util.Arrays;

public class RemoveDuplicate {

    public static int removeUnsortedArray(int[] nums){
        int i = 0;
        for(int j = 1; j < nums.length; j++){
            if(nums[i] != nums[j]){
                nums[i+1] = nums[j];
                i++;
            }
        }
        return i+1;
    }

    public static void main(String[] args) {
        int[] arr = {0,0,1,1,1,2,2,3,3,4};
        removeUnsortedArray(arr);

    }
}

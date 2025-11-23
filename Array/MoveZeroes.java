//https://www.geeksforgeeks.org/batch/gfg-160-problems/track/arrays-gfg-160/problem/move-all-zeroes-to-end-of-array0751
package Array;

public class MoveZeroes {

        void pushZerosToEnd(int[] arr) {
            int count = 0;
            for(int i = 0; i < arr.length; i++){
                if(arr[i] != 0){
                    arr[count] = arr[i];
                    count += 1;
                }
            }
            while(count < arr.length){
                arr[count] = 0;
                count++;
            }
        }

        //second approach
        public void moveZeroes(int[] nums) {
        int j = -1;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                j = i;
                break;
            }
        }
        if(j == -1) return;

        for(int i = j+1; i< nums.length; i++){
            if(nums[i] != 0){
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                j++;
            }
        }
    }
}


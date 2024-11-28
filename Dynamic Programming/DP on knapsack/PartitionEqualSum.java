//https://leetcode.com/problems/partition-equal-subset-sum/description/

public class PartitionEqualSum {

    public boolean canPartition(int[] nums) {
        int sum = 0;
        for(int val : nums){
            sum += val;
        }
        if(sum % 2 != 0) return false;

        return subsetSum(nums, sum/2);
    }
    public boolean subsetSum(int[] arr, int sum){
        boolean[][] t = new boolean[arr.length+1][sum+1];

        //initialise
        for(int i = 0; i < arr.length+1; i++){
            for(int j = 0; j < sum+1; j++){
                if(i == 0) t[i][j] = false;
                else if(j == 0) t[i][j] = true;
            }
        }

        //n = i; j = w
        for(int i = 1; i < arr.length+1; i++){
            for(int j = 1; j < sum+1; j++){
                if(arr[i - 1] <= j){
                    t[i][j] = t[i-1][j - arr[i-1]] || t[i-1][j];
                }
                else{
                    t[i][j] = t[i-1][j];
                }
            }
        }
        return t[arr.length][sum];
    }
}

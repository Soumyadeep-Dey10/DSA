package Cheatsheet;

public class MaximumSubarraySum {
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        int max_sum = 0, sum = 0;
        for(int i : arr){
            sum += i;
            max_sum = Math.max(sum, max_sum);
            if(sum < 0) sum = 0;
        }
        System.out.println(max_sum);
    }
}

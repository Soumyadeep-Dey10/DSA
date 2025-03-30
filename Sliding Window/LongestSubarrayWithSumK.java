//https://www.geeksforgeeks.org/problems/longest-sub-array-with-sum-k0809/1
class LongestSubarrayWithSumK {
    public static int longestSubarray(int[] arr, int k) {
         
         int sum = 0, ans = Integer.MIN_VALUE;
         int i = 0, j = 0;
         while(j < arr.length){
             sum += arr[j];
             if(sum == k) {
                 ans = Math.max(ans, (j-i+1));
             }
             else if(sum > k){
                     sum -= arr[i];
                     i++;
                 
             }
            j++;
         }
         return ans;
            
    }
	public static void main(String[] args){
		int[] arr = {4,1,1,1,1,2,3,5};
		System.out.println(longestSubarray(arr,8));
}
}
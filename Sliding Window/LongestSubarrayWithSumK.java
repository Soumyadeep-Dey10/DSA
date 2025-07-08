//https://www.geeksforgeeks.org/problems/longest-sub-array-with-sum-k0809/1
class LongestSubarrayWithSumK {
    public static int longestSubarray(int[] arr, int k) {
         
          int i = 0, j = 0;
        int sum = 0, max = Integer.MIN_VALUE;
        
        while(j < arr.length){
            sum += arr[j];
            
            if(sum < k) j++;
            else if(sum == k){
                max = Math.max(max, j - i + 1);
                j++;
            }else if(sum > k){
                while(sum > k){
                    sum -= arr[i];
                    i++;
                }
                j++;
            }
        }
        return max;
            
    }
	public static void main(String[] args){
		int[] arr = {4,1,1,1,1,2,3,5};
		System.out.println(longestSubarray(arr,8));
}
}

//https://www.geeksforgeeks.org/problems/count-triplets-with-sum-smaller-than-x5549/1
class Solution {
    long countTriplets(int n, int sum, long arr[]) {
        long count = 0;
        
        Arrays.sort(arr);
        
        for(int i = 0; i < n-2; i++){
            int left = i+1, right = n-1;
            
            while(left < right){
                long total = arr[i]+arr[left]+arr[right];
            
                if(total < sum){
                    count += right-left;
                    left++;
                }
                else if(total >= sum){
                    right--;
                }
            }
            
        }
        return count;
    }
}

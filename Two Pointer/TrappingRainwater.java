//https://leetcode.com/problems/trapping-rain-water/submissions/1714913023/
class Solution {
    public int trap(int[] arr) {
         int i = 0, j = arr.length - 1;
        int sum  = 0;
        int lmax = 0, rmax = 0;
        
        
        while(i < j){
            lmax = Math.max(lmax, arr[i]);
            rmax = Math.max(rmax, arr[j]);
            
            if(lmax < rmax){
                sum += lmax - arr[i];
                i++;
            }else{
                sum += rmax - arr[j];
                j--;
            }
        }
        return sum;
    }
}
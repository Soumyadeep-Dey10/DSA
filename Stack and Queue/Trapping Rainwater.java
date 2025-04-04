//https://leetcode.com/problems/trapping-rain-water/
class Solution {
    public int trap(int[] height) {
        int size=height.length;
        int[] left=new int[size];
        int[] right=new int[size];
        left[0]=height[0];
        for(int i=1;i<size;i++){
            left[i]=Math.max(height[i],left[i-1]);
        }
        right[size-1]=height[size-1];
        for(int i=size-2;i>=0;i--){
            right[i]=Math.max(height[i],right[i+1]);
        }
        int ans=0;
        for(int i=0;i<size;i++){
            ans+=(Math.min(left[i],right[i])-height[i]);
        }
        return ans;
    }
}

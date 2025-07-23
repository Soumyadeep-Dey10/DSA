//https://www.geeksforgeeks.org/batch/gfg-160-problems/track/two-pointer-technique-gfg-160/problem/subarray-with-given-sum-1587115621
class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0, j = 0;
        int sum = 0;
        
        while(j < arr.length){
            sum += arr[j];
            
            if(sum > target){
                while(sum > target){
                    sum -= arr[i];
                    i++;
                }
                
            }
            
            if(sum == target){
                list.add(i+1);
                list.add(j+1);
                return list;
            }
            
            
            j++;
        }
        list.add(-1);
        return list;
    }
}

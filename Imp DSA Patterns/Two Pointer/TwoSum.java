//Brute force approach
class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};       
    }


	//If array is sorted
	public int[] twoSum(int[] nums, int target) {
       Arrays.sort(nums);

       int i = 0, j = nums.length-1;
       while(i < j){
        if(nums[i] + nums[j] == target){
            return new int[]{i, j};
        }
        else if(nums[i] + nums[j] < target){
            i++;
        }
        else if(nums[i] + nums[j] > target){
            j--;
        }
       }
     return new int[]{-1, -1};       
    }
	
	//Optimal approach
      public int[] twoSum(int[] nums, int target) {
       HashMap<Integer, Integer> map = new HashMap<>();

       for(int i = 0; i < nums.length; i++){
            int rem = target - nums[i];
            if(map.containsKey(rem)){
                return new int[]{map.get(rem), i};
            }
            map.put(nums[i], i);
       }
       return new int[]{-1, -1};     
    }

}
//https://leetcode.com/problems/combination-sum-ii/
class Solution {
    public List<List<Integer>> combinationSum2(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        generate(nums, 0, target, new ArrayList<Integer>(), ans);
        return ans;       
    }
    public void generate(int[] arr, int ind, int target, List<Integer> list, List<List<Integer>> res){

        if(target == 0){
            res.add(new ArrayList<>(list));
            return;
        }
        
            
        for(int i = ind; i < arr.length; i++){
            if(i != ind && arr[i] == arr[i-1]) continue;
            if(arr[i] > target) break;

            list.add(arr[i]);
            generate(arr, i+1, target - arr[i], list, res);
            list.remove(list.size() - 1);
        }
    }
}
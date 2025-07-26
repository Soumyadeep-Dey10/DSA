//https://leetcode.com/problems/subsets-ii/

class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        generate(nums, 0, new ArrayList<Integer>(), ans);
        return ans;
    }
    public void generate(int[] arr, int ind, List<Integer> list, List<List<Integer>> res){
        
        res.add(new ArrayList<>(list));
            
        for(int i = ind; i < arr.length; i++){
            if(i != ind && arr[i] == arr[i-1]) continue;

            list.add(arr[i]);
            generate(arr, i+1, list, res);
            list.remove(list.size() - 1);
        }
    }
}
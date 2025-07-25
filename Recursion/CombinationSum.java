//https://leetcode.com/problems/combination-sum/
class Solution {
    public List<List<Integer>> combinationSum(int[] arr, int target) {
        List<List<Integer>> result = new ArrayList<>();
        check(arr,  0, target, new ArrayList<>(), result);
        return result;
    }

    public void check(int[] arr, int i, int target, List<Integer> list, List<List<Integer>> result){
        if(i == arr.length){
            if(target == 0){
                result.add(new ArrayList<>(list));
            }
            return ;
        }

        if(arr[i] <= target){
            list.add(arr[i]);
            check(arr, i, target - arr[i], list, result);
            list.remove(list.size() - 1); // to check all combination
        }
        check(arr, i+1, target, list, result); //not pick   
    }
}
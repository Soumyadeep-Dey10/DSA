//https://leetcode.com/problems/subsets/
class Solution {
    public List<List<Integer>> subsets(int[] arr) {
        List<List<Integer>> result = new ArrayList<>();
        generateSubsets(arr,  0, new ArrayList<>(), result);
        return result;
    }
    public void generateSubsets(int[] arr, int i, List<Integer> list, List<List<Integer>> result){
        if(i == arr.length){
            result.add(new ArrayList<>(list));
            return;
        }
        list.add(arr[i]);
        generateSubsets(arr, i+1, list, result);

        //not pick
        list.remove(list.size() - 1);
        generateSubsets(arr, i+1, list, result);
    }
}
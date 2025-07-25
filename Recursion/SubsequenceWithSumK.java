//count all subsquence with sum k
class Solution {
    public List<List<Integer>> subsets(int[] arr, int k) {
        List<List<Integer>> result = new ArrayList<>();
        generateSubsets(arr,  0, new ArrayList<>(), result, k, 0);
        return result;
    }
    public void generateSubsets(int[] arr, int i, List<Integer> list, List<List<Integer>> result, int k, int sum){
        if(i == arr.length){
	    if(sum == k){
		result.add(new ArrayList<>(list));
	    }
            return;
        }
        list.add(arr[i]);
	sum += arr[i];
        generateSubsets(arr, i+1, list, result);

        //not pick
        list.remove(list.size() - 1);
	sum -= arr[i];
        generateSubsets(arr, i+1, list, result);
    }
}
//https://www.geeksforgeeks.org/problems/subset-sums2234/1&selectedLang=python3
class Solution {
    public ArrayList<Integer> subsetSums(int[] arr) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        generate(arr, 0, 0, list);
        return list;
    }
    public static void generate(int[] arr, int i, int sum, ArrayList<Integer> list){
        if(i == arr.length){
            list.add(sum);
            return;
        }
        generate(arr, i+1, sum + arr[i], list);
        generate(arr, i+1, sum, list);
    }
}
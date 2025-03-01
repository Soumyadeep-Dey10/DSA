//https://www.geeksforgeeks.org/problems/unique-frequencies-of-not/1?page=1&category=Map&difficulty=Easy&sortBy=submissions
class Solution {
    public static boolean isFrequencyUnique(int n, int[] arr) {
        // code here
        HashMap<Integer, Integer> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();
        
        for(int val : arr){
            map.put(val, map.getOrDefault(val,0) +1);
        }
        
        for(int val : map.values()){
            //check for duplicate
            if(!set.add(val)) return false;
        }
        return true;
    }
}
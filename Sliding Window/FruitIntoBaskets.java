//https://leetcode.com/problems/fruit-into-baskets/
class Solution {
    public int totalFruit(int[] arr) {
        if(arr.length == 1) return 1;

        HashMap<Integer, Integer> map = new HashMap<>();
        int i = 0, j = 0, ans = 0;

        while(j < arr.length){
            int val = arr[j];
            map.put(val, map.getOrDefault(val, 0) + 1);

            if(map.size() <= 2){
                ans = Math.max(ans, j - i + 1);
            }
            else {
                while(map.size() > 2){
                    int val1 = arr[i];
                    map.put(val1, map.get(val1) - 1);
                    if(map.get(val1) == 0) map.remove(val1);
                    i++;
                }
            }

            j++; 
        }

        return ans;
    }
}

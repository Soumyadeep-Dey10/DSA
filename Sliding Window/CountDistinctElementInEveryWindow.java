//https://www.geeksforgeeks.org/batch/gfg-160-problems/track/two-pointer-technique-gfg-160/problem/count-distinct-elements-in-every-window
class Solution {
    ArrayList<Integer> countDistinct(int arr[], int k) {
        // code here
        int i = 0, j = 0;
        
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        
        while(j < arr.length){
            
            map.put(arr[j], map.getOrDefault(arr[j],0)+1);
            
            
            
            if(j - i + 1 == k){
                list.add(map.size());
                
                map.put(arr[i], map.get(arr[i]) -1);
                
                if(map.get(arr[i]) == 0) map.remove(arr[i]);
                i++;
            }
            j++;
        }
        return list;
    }
}
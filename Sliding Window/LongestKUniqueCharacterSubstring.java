//https://www.geeksforgeeks.org/problems/longest-k-unique-characters-substring0853/1
class Solution {
    public int longestKSubstr(String s, int k) {
        // code here
        HashMap<Character, Integer> map = new HashMap<>();
        int low = 0, high = 0;
        int ans = -1;
        
        int i = 0, j = 0;
        
        while(j < s.length()){
            char ch = s.charAt(j);
            map.put(ch, map.getOrDefault(ch, 0) +1);
            
            if(map.size() < k) j++;
            
            if(map.size() == k){
                ans = Math.max(ans, j - i + 1);
                j++;
            }
            else if(map.size() > k){
                while(map.size() > k){
                    char ch1 = s.charAt(i);
                    map.put(ch1, map.get(ch1) - 1);
                    
                    //if a character value in map becomes 0 then remove it from map
                    if(map.get(ch1) == 0) map.remove(ch1);
                    i++;
                }
                j++;
            }
        }
        return ans;
    }
}
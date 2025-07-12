//https://leetcode.com/problems/longest-substring-without-repeating-characters/
class Solution {
    public int lengthOfLongestSubstring(String s) {
     HashMap<Character, Integer> map = new HashMap<>();
        int low = 0, high = 0;
        int ans = 0;
        
        int i = 0, j = 0;
        
        while(j < s.length()){
            char ch = s.charAt(j);
            map.put(ch, map.getOrDefault(ch, 0) +1);
            
            
            if(map.size() == j - i + 1){
                ans = Math.max(ans, j - i + 1);
                j++;
            }
            //"pww"..here map size will be 2 and j - i + 1 = 3
            else if(map.size() < j - i + 1){
                //map size cannt be lesser than window alse duplicate char present..so shrink the window
                while(map.size() <  j - i + 1){
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
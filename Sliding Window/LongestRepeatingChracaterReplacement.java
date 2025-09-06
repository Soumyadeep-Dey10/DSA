//https://leetcode.com/problems/longest-repeating-character-replacement/

//better approach
class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character, Integer> map = new HashMap<>();
        int maxLen = 0, maxFreq = 0, l = 0;

        for(int r = 0; r < s.length(); r++){
            char ch = s.charAt(r);
            
            //putting the char in map
            map.put(ch, map.getOrDefault(ch, 0)+1);

            maxFreq = Math.max(maxFreq, map.get(ch));

            while((r-l+1) - maxFreq > k){
                char leftChar = s.charAt(l);
                map.put(leftChar, map.get(leftChar) - 1);
                l++;
            }
            if((r-l+1) - maxFreq <= k){
                maxLen = Math.max(maxLen, r - l + 1);
            }
        }
        return maxLen;
    }
}


//optimal
class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character, Integer> map = new HashMap<>();
        int maxLen = 0, maxFreq = 0, l = 0;

        for(int r = 0; r < s.length(); r++){
            char ch = s.charAt(r);
            
            //putting the char in map
            map.put(ch, map.getOrDefault(ch, 0)+1);

            maxFreq = Math.max(maxFreq, map.get(ch));

            if((r-l+1) - maxFreq > k){
                char leftChar = s.charAt(l);
                map.put(leftChar, map.get(leftChar) - 1);
                l++;
            }
            if((r-l+1) - maxFreq <= k){
                maxLen = Math.max(maxLen, r - l + 1);
            }
        }
        return maxLen;
    }
}
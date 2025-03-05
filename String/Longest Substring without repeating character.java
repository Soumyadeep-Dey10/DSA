//https://leetcode.com/problems/longest-substring-without-repeating-characters/submissions/1354655059/
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] hash = new int[256]; //for all ascii values
        int l = 0, r = 0, maxLen = 0, len = 0;
        Arrays.fill(hash, -1);
        while(r < s.length()){
            char ch = s.charAt(r);
            if(hash[ch] != -1){
                if(hash[ch] >= l){
                    l = hash[ch]+1;
                }
            }
            len = r - l + 1;
            maxLen = Math.max(len, maxLen);
            hash[ch] = r;
            r++;
        }
        return maxLen;
    }
}
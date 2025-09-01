//https://leetcode.com/problems/valid-palindrome/
class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();

        s = s.replaceAll("[^a-z0-9]", ""); //replace all not A-Z,a-z,0-9 with empty, means replace space, special characters, comma etc.

        int i = 0, n = s.length();

        while(i < s.length()){
            if(s.charAt(i) != s.charAt(n-i-1)) return false;
            i++;
        }
        return true;
    }
}
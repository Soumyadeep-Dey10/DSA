//https://leetcode.com/problems/reverse-words-in-a-string/
class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();

        
        String[] str = s.split("\\s+"); //str = ["the", "sky", "is", "blue"]

        for(int i = str.length - 1; i >= 0; i--){
            sb.append(str[i]);
            if(i > 0) sb.append(" ");
        }
        return sb.toString().trim();
    }
}
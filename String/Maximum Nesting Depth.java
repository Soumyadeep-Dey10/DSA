//https://leetcode.com/problems/maximum-nesting-depth-of-the-parentheses/
class Solution {
    public int maxDepth(String s) {
        int count = 0, maxCount = 0;
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '('){
                count += 1;   
            }
            else if(ch == ')'){
                count -= 1;
            }
            maxCount = Math.max(count, maxCount);
        }
        return maxCount;
    }
}
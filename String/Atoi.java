//https://www.geeksforgeeks.org/batch/gfg-160-problems/track/string-gfg-160/problem/implement-atoi
class Solution {
    public int myAtoi(String s) {
        // Your code here
        int result = 0, i = 0, sign = 1;
        while(i < s.length() && s.charAt(i) == ' '){
            i++;
        }
        
        if(i < s.length() && (s.charAt(i) == '+' || s.charAt(i) == '-')){
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }
        
        while(i < s.length() && s.charAt(i) >= '0' && s.charAt(i) <= '9'){
            int digit = s.charAt(i) - '0';
            
            if(result > Integer.MAX_VALUE/10 || (result == Integer.MAX_VALUE/10 && digit > (sign == 1 ? 7 : 8))){
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            result = result * 10 + digit;
            i++;
        }
        return result * sign;
    }
}
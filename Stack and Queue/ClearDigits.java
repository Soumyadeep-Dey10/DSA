//https://leetcode.com/problems/clear-digits/?envType=problem-list-v2&envId=stack
class Solution {
    public String clearDigits(String s) {
        StringBuilder sb = new StringBuilder();

        Stack<Character> st = new Stack<>();  
        for(char ch : s.toCharArray()){
            if(Character.isLetter(ch)){
                st.push(ch);
            }
            else if(Character.isDigit(ch)){
                if(!st.isEmpty()) st.pop();
            }
        }
        Collections.reverse(st);
        while(!st.isEmpty()) sb.append(st.pop());
        return sb.toString();
    }
}
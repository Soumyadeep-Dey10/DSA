//https://leetcode.com/problems/backspace-string-compare/?envType=problem-list-v2&envId=stack
class Solution {

    private String build(String str) {
        Stack<Character> st = new Stack<>();

        for (char ch : str.toCharArray()) {
            if (ch == '#') {
                if (!st.isEmpty()) st.pop();
            } else {
                st.push(ch);
            }
        }

        StringBuilder sb = new StringBuilder();
        while (!st.isEmpty()) {
            sb.append(st.pop());
        }

        return sb.toString();
    }

    public boolean backspaceCompare(String s, String t) {
        return build(s).equals(build(t));
    }
}

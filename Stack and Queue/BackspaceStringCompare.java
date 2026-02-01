//https://leetcode.com/problems/backspace-string-compare/?envType=problem-list-v2&envId=stack
class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> st = new Stack<>();

        // process s
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '#') {
                if (!st.isEmpty()) st.pop();
            } else {
                st.push(s.charAt(i));
            }
        }

        String str1 = "";
        while (!st.isEmpty()) {
            str1 += st.pop();
        }

        st.clear(); // IMPORTANT

        // process t
        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i) == '#') {
                if (!st.isEmpty()) st.pop();
            } else {
                st.push(t.charAt(i));
            }
        }

        String str2 = "";
        while (!st.isEmpty()) {
            str2 += st.pop();
        }

        return str1.equals(str2);
    }
}

//https://leetcode.com/problems/baseball-game/?envType=problem-list-v2&envId=stack
class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        int res = 0;

        for (String op : operations) {
            if (op.equals("C")) {
                st.pop();
            } 
            else if (op.equals("D")) {
                st.push(st.peek() * 2);
            } 
            else if (op.equals("+")) {
                int a = st.pop();
                int b = st.peek();
                st.push(a);
                st.push(a + b);
            } 
            else {
                // number
                st.push(Integer.parseInt(op));
            }
        }

        while (!st.isEmpty()) {
            res += st.pop();
        }

        return res;
    }
}

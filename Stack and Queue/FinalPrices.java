//https://leetcode.com/problems/final-prices-with-a-special-discount-in-a-shop/?envType=problem-list-v2&envId=stack
class Solution {
    public int[] finalPrices(int[] prices) {
        int n = prices.length;
        int[] res = new int[n];
        Stack<Integer> st = new Stack<>();

        // last element has no discount
        res[n - 1] = prices[n - 1];
        st.push(prices[n - 1]);

        for (int i = n - 2; i >= 0; i--) {

            // remove all greater elements
            while (!st.isEmpty() && st.peek() > prices[i]) {
                st.pop();
            }

            // apply discount if possible
            if (st.isEmpty()) {
                res[i] = prices[i];
            } else {
                res[i] = prices[i] - st.peek();
            }

            st.push(prices[i]);
        }

        return res;
    }
}

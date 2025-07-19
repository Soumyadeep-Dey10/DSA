//https://www.geeksforgeeks.org/problems/find-the-closest-pair-from-two-arrays4215/1
class Solution {
    public static ArrayList<Integer> printClosest(int ar1[], int ar2[], int n, int m, int x) {
        ArrayList<Integer> list = new ArrayList<>();
        int diff = Integer.MAX_VALUE;

        int res_l = 0, res_r = 0;

        int l = 0, r = m - 1;  

        while (l < n && r >= 0) {
            int sum = ar1[l] + ar2[r];

            if (Math.abs(sum - x) < diff) {
                res_l = l;
                res_r = r;
                diff = Math.abs(sum - x);
            }

            if (sum > x)
                r--;
            else
                l++;
        }

        list.add(ar1[res_l]);  
        list.add(ar2[res_r]);
        return list;
    }
}

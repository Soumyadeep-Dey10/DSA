class Solution {
    public int[][] merge(int[][] a) {


        Arrays.sort(a, (x, y) -> x[0] - y[0]);

        int n = a.length;
        int[][] res = new int[n][2];
        int idx = 0;

        int s1 = a[0][0];
        int e1 = a[0][1];

        for (int i = 1; i < n; i++) {
            int s2 = a[i][0];
            int e2 = a[i][1];

            // overlapping case
            if (e1 >= s2) {
                e1 = Math.max(e1, e2);
            }
            // not overlapping
            else {
                res[idx][0] = s1;
                res[idx][1] = e1;
                idx++;

                s1 = s2;
                e1 = e2;
            }
        }

        // add last interval
        res[idx][0] = s1;
        res[idx][1] = e1;

        // return exact size
        return Arrays.copyOf(res, idx + 1);
    }
}

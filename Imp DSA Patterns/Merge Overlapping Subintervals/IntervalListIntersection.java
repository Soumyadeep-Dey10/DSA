class Solution {
    public int[][] intervalIntersection(int[][] a, int[][] b) {
        int i = 0, j = 0;
        int n = a.length;
        int m = b.length;

        int[][] res = new int[n + m][2]; // FIXED SIZE
        int index = 0;

        while (i < n && j < m) {
            int s1 = a[i][0];
            int e1 = a[i][1];
            int s2 = b[j][0];
            int e2 = b[j][1];

            if (s1 <= s2) {
                if (e1 >= s2) {
                    int s = Math.max(s1, s2);
                    int e = Math.min(e1, e2);
                    res[index][0] = s;
                    res[index][1] = e;
                    index++;
                }
            } else {
                if (e2 >= s1) {
                    int s = Math.max(s1, s2);
                    int e = Math.min(e1, e2);
                    res[index][0] = s;
                    res[index][1] = e;
                    index++;
                }
            }

            if (e1 <= e2) {
                i++;
            } else {
                j++;
            }
        }
       return Arrays.copyOf(res, index);

    }
}

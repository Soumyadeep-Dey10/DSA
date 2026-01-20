class Solution {
    public int maximumSum(int[] a) {
        
    int n = a.length;
    int noDel = a[0];
    int oneDel = Integer.MIN_VALUE;
    int res = a[0];

    for (int i = 1; i < n; i++) {
        int prevNoDel = noDel;
        int prevOneDel = oneDel;
        noDel = Math.max(a[i], noDel + a[i]);

        int v2;
        if(prevOneDel == Integer.MIN_VALUE){
            v2 = a[i];
        }else{
            v2 = prevOneDel + a[i];
        }
        oneDel = Math.max(prevNoDel, v2);

        res = Math.max(res, Math.max(noDel, oneDel));
    }

    return res;
    }
}
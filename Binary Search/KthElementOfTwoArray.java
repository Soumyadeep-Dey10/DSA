//https://www.geeksforgeeks.org/batch/gfg-160-problems/track/searching-gfg-160/problem/k-th-element-of-two-sorted-array1317
class Solution {
    public int kthElement(int a[], int b[], int k) {
        // code here
        int n = a.length, m = b.length;
        
        int last = 0, i = 0, j = 0;
        
        for(int d = 0; d < k; d++){
            if(i < n){
                if(j < m && a[i] > b[j]){
                    last =  b[j];
                    j++;
                }else{
                    last = a[i];
                    i++;
                }
            }
            else if(j < m){
                last = b[j];
                j++;
            }
        }
        return last;
    }
}
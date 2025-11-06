//https://www.geeksforgeeks.org/problems/find-nth-root-of-m5843/1
class Solution {
    
    int calculate(int mid, int n, int m){
        long ans = 1;
        for(int i = 1; i <= n; i++){
            ans = ans * mid;
            if(ans > m) return 2; //too large
        }
        if(ans == m) return 1; //correct
        return 0;
    } 
    public int nthRoot(int n, int m) {
        // code here
        int low = 1, high = m;
        while(low <= high){
            int mid = low + (high - low)/2;
            
            int res = calculate(mid, n, m);
            if(res == 1) return mid;
            else if(res == 2) high = mid-1;
            else low = mid+1;
        }
        return -1;
    }
}

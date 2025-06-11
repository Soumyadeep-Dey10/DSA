
class Solution {
    static int minRemoval(int intervals[][]) {
        // code here
        int count = 0;
        Arrays.sort(intervals, (a,b) -> a[0] - b[0]);
        
        int end = intervals[0][1];
        for(int i = 1; i < intervals.length; i++){
            if(intervals[i][0] < end){
                count++;
                end = Math.min(intervals[i][1], end);
            }else{
                end = intervals[i][1];
            }
        }
        return count;
    }
}

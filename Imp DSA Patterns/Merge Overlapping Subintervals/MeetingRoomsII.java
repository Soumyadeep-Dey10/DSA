class Solution {
    public int minMeetingRooms(int[] start, int[] end) {
        // code her
        int i = 0, j = 0;
        int room = 0, res = 0;
        Arrays.sort(start);
        Arrays.sort(end);
        while(i < start.length && j < end.length){
            if(start[i] < end[j]){
                room++;
                res = Math.max(room, res);
                i++;
            }
            else{
                room--;
                j++;
            }
        }
       
        return res;
    }
}

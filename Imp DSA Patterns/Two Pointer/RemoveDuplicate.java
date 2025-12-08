class Solution {
    public int removeDuplicates(int[] arr) {
        int res = 1, cm = 1, of = 0;
        
        while(cm < arr.length){
            if(arr[cm] == arr[cm - 1]){
                cm++;
                continue;
            }
            arr[of+1] = arr[cm];
            of++;
            res++;
            cm++;
        }
        return res;
    }
}
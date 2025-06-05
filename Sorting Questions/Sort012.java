class Solution {
    // Function to sort an array of 0s, 1s, and 2s
	//count approach
    public void sort012(int[] arr) {
        // code here
        int count0 = 0, count1 = 0, count2 = 0;
        for(int val : arr){
            if(val == 0) count0++;
            if(val == 1) count1++;
            if(val == 2) count2++;
        }
        
       int index = 0;
       while(index < count0){
           arr[index++] = 0;
       }
       while(index < count0 + count1){
           arr[index++] = 1;
       }
       while(index < count0 + count1 + count2){
           arr[index++] = 2;
       }
    }
}
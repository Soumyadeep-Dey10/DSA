class Solution {
    // Function to remove duplicates from the given array
    public int removeDuplicates(int[] arr) {
        // Code Here
        int temp = 1;
        for(int i = 1; i < arr.length ; i++){
            if(arr[i-1] != arr[i]){
                arr[temp++] = arr[i];
            }
        }
        return temp;
    }
}
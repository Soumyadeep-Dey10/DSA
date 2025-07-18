class Solution {
    // boolean twoSum(int arr[], int target) {
    //     // code here
    //     HashSet<Integer> set = new HashSet<>();

    //     for (int i = 0; i < arr.length; i++) {

    //         // Calculate the complement that added to
    //         // arr[i], equals the target
    //         int complement = target - arr[i];

    //         // Check if the complement exists in the set
    //         if (set.contains(complement)) {
    //             return true;
    //         }

    //         // Add the current element to the set
    //         set.add(arr[i]);
    //     }
    //     // If no pair is found
    //     return false;
    // }
    

    //2 pointer approach
    // boolean twoSum(int[] arr, int target){
    //     int i = 0, j = arr.length - 1;
    //     Arrays.sort(arr);
        
    //     while(i < j){
    //         if(arr[i] + arr[j] == target){
    //             return true;
    //         }
    //         else if(arr[i] + arr[j] < target){
    //             i++;
    //         }
    //         else {
    //             j--;
    //         }
    //     }
    //     return false;
    // }
    
	//binary search approach
	
	static boolean binarySearch(int[] arr, int left,
                                int right, int target){
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target)
                return true;
            if (arr[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return false;
    }
    boolean twoSum(int arr[], int target) {
        // code here
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];

            // Use binary search to find the complement
            if (binarySearch(arr, i + 1, arr.length - 1,
                             complement))
                return true;
        }
        // If no pair is found
        return false;
    }
}
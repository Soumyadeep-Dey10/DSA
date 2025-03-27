//https://www.geeksforgeeks.org/problems/first-negative-integer-in-every-window-of-size-k3345/1
class Solution {
    static List<Integer> firstNegInt(int arr[], int k) {
       List<Integer> temp = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        
        int i = 0, j = 0;
        while (j < arr.length) {
           
            if (arr[j] < 0) {
                temp.add(arr[j]);
            }
            
            
            // Once the window size reaches k
            else if (j - i + 1 == k) {
                // If temp is empty, no negative number, so add 0
                if (temp.size() == 0) {
                    ans.add(0);
                } else {
                    // Add the first negative number to the result
                    ans.add(temp.get(0));
                    
                    // If the element going out of the window is negative, remove it from temp
                    if (arr[i] < 0) {
                        temp.remove(0); // Only remove if arr[i] is negative
                    }
                    
                    
                    
                }
            }
            i++;
            j++;
        }
        return ans;
    }
}
//https://leetcode.com/problems/valid-anagram/
class Solution {
    public boolean isAnagram(String s, String t) {

        //convert string to character array
        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();
        
        //sort those arrays
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        //checking if both are equal
        return Arrays.equals(arr1, arr2);
    }
}
//https://leetcode.com/problems/longest-common-prefix/
class Solution {
    public String longestCommonPrefix(String[] arr) {
        //just check first and the last to get the maximum common
        Arrays.sort(arr);

        String s1 = arr[0];
        String s2 = arr[arr.length - 1];
        int i = 0;

        //check flight and flower(f = f, l = l....)
        while(i < s1.length() && i < s2.length() && s1.charAt(i) == s2.charAt(i)){
            i++;
        }
        return s1.substring(0,i);
    }
}
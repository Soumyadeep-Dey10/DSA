//https://leetcode.com/problems/reverse-string/
class Solution {
    public void reverseString(char[] s) {
        //take two pointer at the first and last, and swap them
        int i = 0, j = s.length - 1;

        while(i < j){
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;
        }
    }
}
//https://leetcode.com/problems/largest-odd-number-in-string/
class Solution {
    public String largestOddNumber(String num) {
        int i = num.length() - 1; // "2" (52)
        String ans = "";
        while(i >= 0){
            int number = Character.getNumericValue(num.charAt(i)); // int 2, 5
            if(number % 2 != 0){
                ans = num.substring(0, i+1);  //ans = substring(0, 0+1) = 5
                break;
            }
            i--;
        }
        return ans;
    }
}
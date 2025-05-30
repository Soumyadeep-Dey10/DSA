//https://www.geeksforgeeks.org/batch/gfg-160-problems/track/string-gfg-160/problem/add-binary-strings3805
class Solution {
    public String addBinary(String s1, String s2) {
        // code here
        int i = s1.length() - 1, j = s2.length()-1;
        StringBuilder result = new StringBuilder();
        int carry = 0;
        while(i >=  0|| j >= 0|| carry > 0){
            int sum = carry;
            if(i >= 0){
                sum += s1.charAt(i) - '0';
                i--;
            }
            if(j >= 0){
                sum += s2.charAt(j) - '0';
                j--;
            }
            result.append(sum % 2);
            carry = sum/2;
        }
        String res = result.reverse().toString();
        int firstNonZero = 0;
        while(firstNonZero < res.length() && res.charAt(firstNonZero) == '0'){
            firstNonZero++;
        }
        return firstNonZero == res.length() ? "0" : res.substring(firstNonZero);
        
    }
}
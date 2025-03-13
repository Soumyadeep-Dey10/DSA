//https://leetcode.com/problems/check-if-the-sentence-is-pangram/
class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean[] arr = new boolean[26];
        for(char ch : sentence.toCharArray()){
            arr[ch - 'a'] = true; //arr[b - a] = arr[1] = true
        }
        
        for(boolean b : arr){
            if(!b) return false;
        }
        return true;
    }
}
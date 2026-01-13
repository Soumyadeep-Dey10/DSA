class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(char ch : s.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        boolean odd = false;
        int res = 0;

        for(char ch : map.keySet()){
            int val = map.get(ch);
            if(val % 2 == 0){
                res += val;
            }else{
                res += val-1;
                odd = true;
            }
        }
        return odd ? res+1 : res;
    }
}
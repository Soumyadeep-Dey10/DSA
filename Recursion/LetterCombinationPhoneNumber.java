//https://leetcode.com/problems/letter-combinations-of-a-phone-number/
class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        if(digits.length() == 0)
            return ans;
        
        HashMap<Character, String> hm = new HashMap<>();
        hm.put('2', "abc");
        hm.put('3', "def");
        hm.put('4', "ghi");
        hm.put('5', "jkl");
        hm.put('6', "mno");
        hm.put('7', "pqrs");
        hm.put('8', "tuv");
        hm.put('9', "wxyz");
        
        helper(digits, 0, hm, new StringBuilder(), ans);
        return ans;
    }
    public void helper(String digits, int i, HashMap<Character, String> map, StringBuilder sb, List<String> ans){
        if(i == digits.length()){
            ans.add(sb.toString());
            return;
        }

        String current = map.get(digits.charAt(i));

        for(int k = 0; k < current.length(); k++){
            sb.append(current.charAt(k));
            helper(digits, i+1, map, sb, ans);
            sb.deleteCharAt(sb.length() -1);
        }
    }
}
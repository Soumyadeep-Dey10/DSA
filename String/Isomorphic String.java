//https://leetcode.com/problems/isomorphic-strings/
class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) return false;
        HashMap<Character, Character> map = new HashMap<>();

        //s = badc, t = baba 
        for(int i = 0; i < s.length(); i++){
            //checking b is already there in the map or not
            if(map.containsKey(s.charAt(i))){

                //if b is there then check if b mapping is same
                if(!map.get(s.charAt(i)).equals(t.charAt(i))){
                    return false;
                }
            }
            else{
                //check for 3rd character b in t string which is already in the map
                if(map.containsValue(t.charAt(i))){
                    return false;
                }
                map.put(s.charAt(i), t.charAt(i));
            }
        }
        return true;
    }
}
class Solution {
//optimal
	public char findTheDifference(String s, String t) {
        char res = 0;

        for (char c : s.toCharArray()) {
            res ^= c;
        }
        for (char c : t.toCharArray()) {
            res ^= c;
        }

        return res;
    }



//second approach
    public char findTheDifference(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(char ch : s.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }

        for(char ch : t.toCharArray()){
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch)-1);
                if(map.get(ch) == 0){
                    map.remove(ch);
                }
            }           
            else return ch;
        }
        return '\0';
    }
}
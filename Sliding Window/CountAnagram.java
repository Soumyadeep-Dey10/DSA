//https://www.geeksforgeeks.org/problems/count-occurences-of-anagrams5839/1
class Solution {

    int search(String pat, String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(char ch : pat.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        
        int i = 0, j = 0;
        int count = map.size();
        int ans = 0;
        int k = pat.length();
        
        while(j < s.length()){
            char ch = s.charAt(j);
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch) - 1);
                if(map.get(ch) == 0) count--;
            }
            
            if(j - i + 1 < k){
                j++;
            } 
            else if(j - i + 1 == k){
                if(count == 0) ans++;
                
                char leftChar = s.charAt(i);
                if(map.containsKey(leftChar)){
                    map.put(leftChar, map.get(leftChar) + 1);
                    if(map.get(leftChar) == 1) count++;
                }
                
                i++;
                j++;
            }
        }
        return ans;
    }
}

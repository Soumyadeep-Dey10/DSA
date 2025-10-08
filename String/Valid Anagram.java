//https://leetcode.com/problems/valid-anagram/
class Solution {
    public boolean isAnagram(String s, String t) {

        //convert string to character array
        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();
        
        //sort those arrays
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        //checking if both are equal
        return Arrays.equals(arr1, arr2);
    }

    //better approach
    
public static boolean areAnagrams(String s1, String s2) {
        // code here
        
        if(s1.length() != s2.length()) return false;
        
        int[] freq = new int[26];
        
        for(int i = 0; i < s1.length(); i++){
            freq[s1.charAt(i) - 'a']++;
            freq[s2.charAt(i) - 'a']--;
        }
        for(int i = 0; i < freq.length; i++){
            if(freq[i] != 0) return false;
        }
        return true;
    }


    //for unicode character strings
    public boolean isAnagram(String s1, String s2) {
        if(s1.length() != s2.length()) return false;
        
        HashMap<Character, Integer> map = new HashMap<>();
        
        for(char ch : s1.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        
        for(char ch: s2.toCharArray()){
            if(!map.containsKey(ch)) return false; //if char not found return false
            
            map.put(ch, map.get(ch) -1);
            
            if(map.get(ch) == 0) map.remove(ch);
        }
        return map.isEmpty();
    }
}

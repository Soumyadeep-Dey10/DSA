//https://www.geeksforgeeks.org/problems/longest-k-unique-characters-substring0853/1
class LongestKUniqueChar {
    public int longestkSubstr(String s, int k) {
        // code here
        int ans = -1;
        Map<Character,Integer> map = new HashMap<>();
        int i = 0, j = 0;
        while(j < s.length()){
            map.put(s.charAt(j),map.getOrDefault(s.charAt(j),0)+1);
            //if map size equal to k,means k distinct har in map
            if(map.size() == k){
                ans = Math.max(ans, j-i+1);
            }
            
            //if more than k unique har,then shrink the window
            if(map.size() > k){
                char leftChar = s.charAt(i);
                
                //remove char i from the map if the freq of char i is 0
                map.put(leftChar, map.get(leftChar)-1);
                
                if(map.get(leftChar) == 0)
                map.remove(leftChar);
                i++;
            }
            j++;
        }
        return ans;
    }
}
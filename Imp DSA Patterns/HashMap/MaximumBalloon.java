class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character, Integer> have = new HashMap<>();
        for(char ch : text.toCharArray()){
            have.put(ch, have.getOrDefault(ch, 0) +1);
        }
        HashMap<Character, Integer> need = new HashMap<>();
        need.put('b',1);
        need.put('a',1);
        need.put('l',2);
        need.put('o',2);
        need.put('n',1);
        
        int res = Integer.MAX_VALUE;

        for(char ch: need.keySet()){
            int times = have.getOrDefault(ch, 0)/need.get(ch);
            res = Math.min(times, res);
        }
        return res;
    }

	//second approach
	 public int maxNumberOfBalloons(String text) {
        HashMap<Character, Integer> map = new HashMap<>();

        // Count characters
        for (char ch : text.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        int count = 0;
        String word = "balloon";

        while (true) {
            // Try to construct one "balloon"
            for (char ch : word.toCharArray()) {
                if (!map.containsKey(ch)) {
                    return count;
                }

                map.put(ch, map.get(ch) - 1);
                if (map.get(ch) == 0) {
                    map.remove(ch);
                }
            }
            count++;
        }
    }
}
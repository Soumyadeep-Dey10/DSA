//https://leetcode.com/problems/string-matching-in-an-array/
class Solution {
    public List<String> stringMatching(String[] words) {
        Set<String> set = new HashSet<>(); // Use Set to avoid duplicates
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (i != j && words[j].contains(words[i])) {
                    set.add(words[i]); // Add to Set to avoid duplicates
                }
            }
        }
        return new ArrayList<>(set); // Convert Set to List
    }
}

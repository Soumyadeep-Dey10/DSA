//https://www.geeksforgeeks.org/problems/word-with-maximum-frequency0120/1?page=1&category=Map&difficulty=Easy&sortBy=submissions
class Solution {
    public String maximumFrequency(String s) {
        HashMap<String, Integer> map = new HashMap<>();
        String[] words = s.split(" ");
        
        int maxFreq = 0;
        String maxWord = "";

        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
            
            
            if (map.get(word) > maxFreq) {
                maxFreq = map.get(word);
                maxWord = word;
            }
        }

        return maxWord + " " + maxFreq;
    }
}
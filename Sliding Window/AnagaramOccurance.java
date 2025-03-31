//https://www.geeksforgeeks.org/problems/count-occurences-of-anagrams5839/1
class AnagramOccurance {

    int search(String pat, String txt) {
        int ans = 0;
        int k = pat.length();
        HashMap<Character, Integer> map = new HashMap<>();

        // Populate the map with the frequency of characters in pattern
        for (char ch : pat.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        int count = map.size(); // Count of distinct characters in pattern
        int i = 0, j = 0;

        while (j < txt.length()) {
            // Decrease the frequency if the character is found in the pattern
            char ch = txt.charAt(j);
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) - 1);
                if (map.get(ch) == 0) count--; // A required character count matched
            }

            // If window size is smaller than k, expand it
            if (j - i + 1 < k) {
                j++;
            } 
            // When window size is exactly k
            else if (j - i + 1 == k) {
                // If all characters are matched, we found an anagram
                if (count == 0) ans++;

                // Start sliding the window
                char leftChar = txt.charAt(i);
                if (map.containsKey(leftChar)) {
                    if (map.get(leftChar) == 0) count++; // A matched character is removed
                    map.put(leftChar, map.get(leftChar) + 1);
                }

                // Move the left boundary of the window
                i++;
                j++;
            }
        }
        return ans;
    }
}
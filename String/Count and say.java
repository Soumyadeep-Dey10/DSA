//https://leetcode.com/problems/count-and-say/submissions/1196910092/
class Solution {
    public String countAndSay(int n) {
        if (n == 1) return "1";
        if (n == 2) return "11";
        
        String s = "11";
        
        for (int i = 3; i <= n; i++) {
            s += '$';  // Adding a delimiter to handle the last character in the loop
            
            int count = 1;
            String t = "";
            
            for (int j = 1; j < s.length(); j++) {
                if (s.charAt(j) != s.charAt(j - 1)) {
                    t += Integer.toString(count) + s.charAt(j - 1);
                    count = 1;
                } else {
                    count++;
                }
            }
            
            s = t;
        }
        
        return s;
    }
}
//https://leetcode.com/problems/rotate-string/
class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()) return false;
        if(s.length() == 0 || goal.length() == 0) return false;

        //s1 = abcde + abcde = abcdeabcde, goal = cdeab
        String s1 = s + s;
        return s1.contains(goal);
    }
}
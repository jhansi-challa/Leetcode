class Solution {
    public boolean rotateString(String s, String goal) {
        // If lengths are not equal, it's impossible
        if (s.length() != goal.length()) return false;

        // Check if goal is a substring of s concatenated with itself
        return (s + s).contains(goal);
    }
}

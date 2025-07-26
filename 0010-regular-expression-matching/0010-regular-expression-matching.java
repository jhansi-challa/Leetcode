public class Solution {
    public boolean isMatch(String s, String p) {
        int m = s.length();
        int n = p.length();

        // dp[i][j] will be true if s[0..i-1] matches p[0..j-1]
        boolean[][] dp = new boolean[m + 1][n + 1];
        dp[0][0] = true; // Empty string matches empty pattern

        // Fill for patterns like a*, a*b*, a*b*c* that can match empty string
        for (int j = 2; j <= n; j++) {
            if (p.charAt(j - 1) == '*' && dp[0][j - 2]) {
                dp[0][j] = true;
            }
        }

        // Fill the table
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                char sc = s.charAt(i - 1);
                char pc = p.charAt(j - 1);

                if (pc == '.' || pc == sc) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else if (pc == '*') {
                    // Zero occurrences of the character before '*'
                    dp[i][j] = dp[i][j - 2];

                    // If the character before '*' matches current char in s
                    char pPrev = p.charAt(j - 2);
                    if (pPrev == '.' || pPrev == sc) {
                        dp[i][j] |= dp[i - 1][j];  // Match one or more
                    }
                }
            }
        }

        return dp[m][n];
    }
}

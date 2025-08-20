class Solution {
    public int strStr(String haystack, String needle) {
        int hLen = haystack.length();
        int nLen = needle.length();

        if (nLen == 0) return 0;      // safe-guard if needle is empty
        if (nLen > hLen) return -1;

        // Two-pointer character-by-character match
        for (int i = 0; i <= hLen - nLen; i++) {
            int j = 0;
            while (j < nLen && haystack.charAt(i + j) == needle.charAt(j)) {
                j++;
            }
            if (j == nLen) return i;  // matched all chars of needle
        }
        return -1;                    // not found
    }
}

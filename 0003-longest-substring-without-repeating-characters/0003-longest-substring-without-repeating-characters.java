class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int curLen = 0;
        int maxLen = 0;
        Set<Character> set = new HashSet<>();
        
        for(int right = 0; right < s.length(); right++){
            while(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
                curLen--;
            }
            set.add(s.charAt(right));
            curLen++;
            maxLen = Math.max(maxLen, curLen);
        }
        return maxLen;
    }
}
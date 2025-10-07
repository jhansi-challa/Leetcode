class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int curSum = 0;
        int curLen = 0;
        int minLen = Integer.MAX_VALUE;

        for(int right = 0; right < nums.length; right++){
            curSum += nums[right];
            while(curSum >= target){
                curLen = right - left + 1;
                minLen = Math.min(minLen, curLen);
                curSum -= nums[left];
                left++;
            }
        }
        return (minLen == Integer.MAX_VALUE)? 0 : minLen;
    }
}
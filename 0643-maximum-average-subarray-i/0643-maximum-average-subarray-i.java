class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int left = 0;
        int curSum = 0;
        int maxSum = 0;
        for(int i = 0; i < k; i++){
             curSum += nums[i];
        }
        maxSum = curSum;
        for(int right = k; right < nums.length; right++){
            curSum -= nums[left];
            left++;
            curSum += nums[right];
            maxSum = Math.max(maxSum, curSum);
        }
        return (double) maxSum / k; 

        
    }
}
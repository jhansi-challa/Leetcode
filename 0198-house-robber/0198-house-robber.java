public class Solution {
    public int rob(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];

        int prev2 = 0;         // dp[i-2]
        int prev1 = 0;         // dp[i-1]

        for (int num : nums) {
            int temp = Math.max(prev1, prev2 + num);
            prev2 = prev1;
            prev1 = temp;
        }
        return prev1;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] nums1 = {1, 2, 3, 1};
        int[] nums2 = {2, 7, 9, 3, 1};

        System.out.println("Input: [1,2,3,1] -> Output: " + sol.rob(nums1)); // 4
        System.out.println("Input: [2,7,9,3,1] -> Output: " + sol.rob(nums2)); // 12
    }
}

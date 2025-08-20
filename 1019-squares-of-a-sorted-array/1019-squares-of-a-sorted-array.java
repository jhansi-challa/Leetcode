import java.util.Arrays;

public class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int i = 0, j = n - 1, k = n - 1;

        while (i <= j) {
            int left = nums[i] * nums[i];
            int right = nums[j] * nums[j];
            if (left > right) {
                ans[k--] = left;
                i++;
            } else {
                ans[k--] = right;
                j--;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums1 = {-4, -1, 0, 3, 10};
        int[] nums2 = {-7, -3, 2, 3, 11};

        System.out.println(Arrays.toString(solution.sortedSquares(nums1)));
        System.out.println(Arrays.toString(solution.sortedSquares(nums2)));
    }
}

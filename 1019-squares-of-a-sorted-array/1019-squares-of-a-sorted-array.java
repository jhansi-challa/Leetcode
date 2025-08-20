import java.util.Arrays;

public class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        
        int left = 0;
        int right = n - 1;
        int pos = n - 1;  // Start filling from the end
        
        while (left <= right) {
            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];
            
            if (leftSquare > rightSquare) {
                result[pos] = leftSquare;
                left++;
            } else {
                result[pos] = rightSquare;
                right--;
            }
            pos--;
        }
        
        return result;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        
        int[] nums1 = {-4,-1,0,3,10};
        System.out.println(Arrays.toString(sol.sortedSquares(nums1))); // [0, 1, 9, 16, 100]
        
        int[] nums2 = {-7,-3,2,3,11};
        System.out.println(Arrays.toString(sol.sortedSquares(nums2))); // [4, 9, 9, 49, 121]
    }
}

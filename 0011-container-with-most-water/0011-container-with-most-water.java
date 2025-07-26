public class Solution {
    public int maxArea(int[] height) {
        int maxArea = 0;
        int left = 0;
        int right = height.length - 1;

        // Two-pointer approach
        while (left < right) {
            int heightLeft = height[left];
            int heightRight = height[right];
            int width = right - left;
            int area = Math.min(heightLeft, heightRight) * width;
            maxArea = Math.max(maxArea, area);

            // Move the pointer pointing to the shorter line
            if (heightLeft < heightRight) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }
}

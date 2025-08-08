import java.util.*;

class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();

        int n = nums.length;
        if (n == 0) return result;

        int start = nums[0]; // Start of the current range

        for (int i = 1; i < n; i++) {
            // If the current number is not consecutive
            if (nums[i] != nums[i - 1] + 1) {
                // Add the previous range
                if (start == nums[i - 1]) {
                    result.add(String.valueOf(start));
                } else {
                    result.add(start + "->" + nums[i - 1]);
                }
                start = nums[i]; // Start a new range
            }
        }

        // Add the last range after the loop ends
        if (start == nums[n - 1]) {
            result.add(String.valueOf(start));
        } else {
            result.add(start + "->" + nums[n - 1]);
        }

        return result;
    }
}

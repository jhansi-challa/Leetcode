public class Solution {
    public boolean canAliceWin(int[] nums) {
        int sumSingle = 0, sumDouble = 0, total = 0;

        for (int num : nums) {
            total += num;
            if (num < 10) {
                sumSingle += num;
            } else {
                sumDouble += num;
            }
        }

        return (sumSingle > total - sumSingle) || (sumDouble > total - sumDouble);
    }

    // Optional: Test method (you can remove it if running on an online judge)
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums1 = {1, 2, 3, 4, 10};       // false
        int[] nums2 = {1, 2, 3, 4, 5, 14};    // true
        int[] nums3 = {5, 5, 5, 25};          // true

        System.out.println(sol.canAliceWin(nums1));
        System.out.println(sol.canAliceWin(nums2));
        System.out.println(sol.canAliceWin(nums3));
    }
}

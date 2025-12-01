class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int n : nums) {
            result ^= n;   // XOR operation
        }
        return result;
    }
}

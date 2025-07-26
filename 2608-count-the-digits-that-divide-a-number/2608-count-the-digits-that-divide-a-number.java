public class Solution {
    public int countDigits(int num) {
        int original = num;
        int count = 0;

        while (num > 0) {
            int digit = num % 10;
            // Skip division by zero
            if (digit != 0 && original % digit == 0) {
                count++;
            }
            num /= 10;
        }

        return count;
    }

    // Optional: test cases
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.countDigits(7));     // Output: 1
        System.out.println(sol.countDigits(121));   // Output: 2
        System.out.println(sol.countDigits(1248));  // Output: 4
    }
}

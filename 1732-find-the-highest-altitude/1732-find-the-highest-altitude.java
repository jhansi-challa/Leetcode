public class Solution {
    public int largestAltitude(int[] gain) {
        int maxAltitude = 0; // Starting altitude
        int currentAltitude = 0;
        
        for (int i = 0; i < gain.length; i++) {
            currentAltitude += gain[i]; // Calculate next altitude
            if (currentAltitude > maxAltitude) {
                maxAltitude = currentAltitude; // Update max if higher
            }
        }
        
        return maxAltitude;
    }

    // Optional: main method to test
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] gain1 = {-5, 1, 5, 0, -7};
        System.out.println(sol.largestAltitude(gain1)); // Output: 1

        int[] gain2 = {-4, -3, -2, -1, 4, 3, 2};
        System.out.println(sol.largestAltitude(gain2)); // Output: 0
    }
}
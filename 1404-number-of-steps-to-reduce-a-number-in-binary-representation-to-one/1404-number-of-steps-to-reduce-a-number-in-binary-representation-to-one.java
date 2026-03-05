public class Solution {
    public int numSteps(String s) {
        // Convert string to char array for easier manipulation
        char[] bin = s.toCharArray();
        int steps = 0;
        int n = bin.length;

        // Start from the least significant bit (rightmost)
        int i = n - 1;
        while (i > 0) { // stop when only one bit remains (the '1' at the front)
            if (bin[i] == '0') {
                // even → divide by 2: just move to the next bit
                i--;
            } else {
                // odd → add 1
                bin[i] = '0'; // flipping current bit
                int j = i - 1;
                while (j >= 0 && bin[j] == '1') {
                    bin[j] = '0';
                    j--;
                }
                if (j >= 0) {
                    bin[j] = '1';
                } else {
                    // carry reached the front → need to add a new '1' at the start
                    char[] newBin = new char[bin.length + 1];
                    newBin[0] = '1';
                    System.arraycopy(bin, 0, newBin, 1, bin.length);
                    bin = newBin;
                    i++; // adjust index due to new length
                }
            }
            steps++;
        }
        return steps;
    }
}
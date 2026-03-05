import java.math.BigInteger;

public class Solution {
    public int numSteps(String s) {
        BigInteger num = new BigInteger(s, 2); // convert binary string to BigInteger
        int steps = 0;
        BigInteger TWO = BigInteger.valueOf(2);

        while (num.compareTo(BigInteger.ONE) > 0) {
            if (num.mod(TWO).equals(BigInteger.ZERO)) {
                // even → divide by 2
                num = num.divide(TWO);
            } else {
                // odd → add 1
                num = num.add(BigInteger.ONE);
            }
            steps++;
        }

        return steps;
    }
}
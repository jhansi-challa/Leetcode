class Solution {
    public int getLastMoment(int n, int[] left, int[] right) {
        int lastMoment = 0;

        
        for (int pos : left) {
            lastMoment = Math.max(lastMoment, pos);
        }

      
        for (int pos : right) {
            lastMoment = Math.max(lastMoment, n - pos);
        }

        return lastMoment;
    }
}

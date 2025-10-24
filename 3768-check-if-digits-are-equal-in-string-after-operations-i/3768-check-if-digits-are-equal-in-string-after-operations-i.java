class Solution {
    public boolean hasSameDigits(String s) {
        char[] res = s.toCharArray();
        int n = res.length; // n = s.length()
        while(n > 2){
            for(int i = 0; i < n -1; i++){
                res[i] = (char)((res[i] - '0' + res[i + 1] + '0') % 10 + '0');
            }
            n = n - 1;
        }
        return res[0] == res[1];
    }
}
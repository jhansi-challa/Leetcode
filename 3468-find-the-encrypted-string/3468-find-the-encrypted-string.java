class Solution {
    public String getEncryptedString(String s, int k) {
        StringBuilder encrypted = new StringBuilder();
        int len = s.length();
        k = k % len;

        for (int i = 0; i < len; i++) {
            char newChar = s.charAt((i + k) % len);
            encrypted.append(newChar);
        }

        return encrypted.toString();
    }
}

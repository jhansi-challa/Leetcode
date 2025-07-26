class Solution {
    public static void reverseString(char[] s) {
        int left = 0, right = s.length - 1;
        while (left < right) {
            // Swap characters at left and right positions
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }

    // Test the function
    public static void main(String[] args) {
        char[] s1 = {'h','e','l','l','o'};
        reverseString(s1);
        System.out.println(s1); // Output: olleh

        char[] s2 = {'H','a','n','n','a','h'};
        reverseString(s2);
        System.out.println(s2); // Output: hannah
    }
}

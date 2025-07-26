public class Solution {
    public static String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]);
            if (i != 0) sb.append(" ");
        }
        return sb.toString();
    }


    public static void main(String[] args) {
        String s1 = "the sky is blue";
        System.out.println(reverseWords(s1));  
        String s2 = "  hello world  ";
        System.out.println(reverseWords(s2));  

        String s3 = "a good   example";
        System.out.println(reverseWords(s3));  
    }
}
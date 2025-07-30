public class Solution {
    public String multiply(String num1, String num2) {
        
        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }

        int n = num1.length();
        int m = num2.length();
        int[] result = new int[n + m];

        
        for (int i = n - 1; i >= 0; i--) {
            int digit1 = num1.charAt(i) - '0';
            for (int j = m - 1; j >= 0; j--) {
                int digit2 = num2.charAt(j) - '0';
                int product = digit1 * digit2;
                int sum = result[i + j + 1] + product;

                result[i + j + 1] = sum % 10; 
                result[i + j] += sum / 10;   
            }
        }

        
        StringBuilder sb = new StringBuilder();
        for (int val : result) {
    
            if (sb.length() == 0 && val == 0) continue;
            sb.append(val);
        }

        return sb.toString();
    }

    // Optional: test with a main method
    public static void main(String[] args) {
        Solution sol = new Solution();
        String num1 = "123";
        String num2 = "456";
        String result = sol.multiply(num1, num2);
        System.out.println("Product: " + result);  // Output: 56088
    }
}


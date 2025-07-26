import java.util.HashMap;

public class Solution {
    public int romanToInt(String s) {
        // Map each Roman numeral to its integer value
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);   map.put('V', 5);
        map.put('X', 10);  map.put('L', 50);
        map.put('C', 100); map.put('D', 500);
        map.put('M', 1000);

        int total = 0;
        int prevValue = 0;

        // Traverse the string from right to left
        for (int i = s.length() - 1; i >= 0; i--) {
            int currValue = map.get(s.charAt(i));
            
            // Subtract if smaller than previous, else add
            if (currValue < prevValue) {
                total -= currValue;
            } else {
                total += currValue;
            }

            prevValue = currValue;
        }

        return total;
    }
}

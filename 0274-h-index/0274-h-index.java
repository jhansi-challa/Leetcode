import java.util.*;

class Solution {
    public int hIndex(int[] arr){
        int n = arr.length;
        
        Arrays.sort(arr);
        
        int hIndex = 0;
        
        for (int i = 0; i < n; i++){
            int papers = n - i;
            hIndex = Math.max(hIndex, Math.min(arr[i], papers));
        }
        
        return hIndex;
    }
}
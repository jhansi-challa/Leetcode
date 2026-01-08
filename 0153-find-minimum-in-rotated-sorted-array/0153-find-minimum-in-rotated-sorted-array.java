         class Solution {
    public int findMin(int[] nums) {
        int n=nums[0];
        for(int i=0;i<nums.length;i++){
            if(n>nums[i]){
                n=nums[i];i++;
            }
        }return n;
    }
}
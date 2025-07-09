class Solution {
    public int findMin(int[] nums) {
        
        int result=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            result=Math.min(result,nums[i]);
        }
        return result;
    }
}
class Solution {
    public int jump(int[] nums) {
        
        if(nums.length==1) return 0;
        int jumps=0;
        int cur=0;
        int far=0;
        for(int i=0;i<nums.length-1;i++){
           far=Math.max(far,i+nums[i]);
           if(i==cur){
            jumps++;
            cur=far;
           }
        }
        return jumps;
    }
}
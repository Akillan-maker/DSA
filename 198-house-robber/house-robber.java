class Solution {
    public int rob(int[] nums) {
        
        // int robA=0;
        // int robB=0;
        // for(int i=0;i<nums.length;i++){
        //     if(i%2==0){
        //         robA+=nums[i];
        //     }
        //     else{
        //         robB+=nums[i];
        //     }
        // }
        // return Math.max(robA,robB);
        int rob=0;
        int notRob=0;

        for(int num:nums){
            int newRob=notRob+num;
            notRob=Math.max(notRob,rob);
            rob=newRob;
        }
        return Math.max(rob,notRob);
    }
}
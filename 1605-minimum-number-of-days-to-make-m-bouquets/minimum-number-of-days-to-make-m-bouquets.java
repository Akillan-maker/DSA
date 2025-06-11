class Solution {

    boolean daysReq(int[] nums,int day,int m,int k){

        int count=0,nofBotique=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<=day){
                count+=1;
            }
            else{
                nofBotique+=count/k;
                count=0;
            }
        }
        nofBotique+=count/k;
        if(nofBotique>=m){
            return true;
        }
        return false;
    }

    public int minDays(int[] bloomDay, int m, int k) {
        if(bloomDay.length<(long)m*(long)k) return -1;
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<bloomDay.length;i++){
            min=Math.min(min,bloomDay[i]);
            max=Math.max(max,bloomDay[i]);
        }
        
        int low=min,high=max;
        int result=high;
        
        while(low<=high){
            int mid=(low+high)/2;

        if(daysReq(bloomDay,mid,m,k)){
            high=mid-1;
        }
        else low=mid+1;
        }
        return low;
    }
   
}
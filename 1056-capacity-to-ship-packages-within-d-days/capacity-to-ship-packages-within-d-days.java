class Solution {
    int max(int[] nums){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
        }
        return max;
    }
    int sum(int[] nums){
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        return sum;
    }
    int days(int[] nums,int capacity){

        int day=1,cap=0;
        for(int i=0;i<nums.length;i++){
            if(cap+nums[i]>capacity){
                day+=1;
                cap=nums[i];
            }
            else cap+=nums[i];
        }
        return day;
    }
    public int shipWithinDays(int[] weights, int days) {
        
        int low=max(weights),high=sum(weights);
        int result=-1;

        while(low<=high){

            int mid=(low+high)/2;

            int dayss=days(weights,mid);
            if(dayss<=days){
                result=mid;
                high=mid-1;
            }
            else low=mid+1;
        }
        return result;
    }
}
class Solution {

    int thresHold(int[] nums,int thres,int num){
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=Math.ceil((double)nums[i]/(double)num);
        }
        return sum;
    }

    int max(int[] nums){

        int maxx=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            maxx=Math.max(maxx,nums[i]);
        }
        return maxx;
    }
    
    public int smallestDivisor(int[] nums, int threshold) {
        
        int low=1,high=max(nums);
        int result=-1;

        while(low<=high){

            int mid=(low+high)/2;
            int sum=thresHold(nums,threshold,mid);

            if(sum<=threshold){
                result=mid;
                high=mid-1;
            }
            else low=mid+1;
        }
        return result;
    }
}
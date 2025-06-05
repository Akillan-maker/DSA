class Solution {
    public int searchInsert(int[] nums, int target) {
        
        int low=0,high=nums.length-1;
        int result=-1;
  
        while(low<=high){
            int mid=(low+high)/2;

            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>target){
                result=mid;
                high=mid-1;
            }
            else low=mid+1;
        }
        if(result==-1){
            return nums.length;
        }
        return result;
    }
}
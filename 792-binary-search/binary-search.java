class Solution {

    int bs(int[] nums,int low,int high,int target){
        if(low>high) return -1;
        int mid=(low+high)/2;

        if(nums[mid]==target) return mid;
        else if(nums[mid]>target) return bs(nums,0,mid-1,target);
        return bs(nums,mid+1,high,target);

    }
    public int search(int[] nums, int target) {
        
        return bs(nums,0,nums.length-1,target);
    }
}
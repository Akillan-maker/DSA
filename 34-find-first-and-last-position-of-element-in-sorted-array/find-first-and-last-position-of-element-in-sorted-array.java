class Solution {

    int firstOcc(int[] arr,int target){
        int low=0,high=arr.length-1;
        int first=-1;

        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==target){
                first=mid;
                high=mid-1;
            }
            else if(arr[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return first;
    }

    int lastOcc(int[] arr,int target){
        int low=0,high=arr.length-1;
        int last=-1;

        while(low<=high){
            int mid=(low+high)/2;

            if(arr[mid]==target){
                last=mid;
                low=mid+1;
            }
            else if(arr[mid]>target){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return last;
    }

    public int[] searchRange(int[] nums, int target) {
        int[] result=new int[2];
         result[0]=-1;
        result[1]=-1;
        int first=firstOcc(nums,target);
        if(first==-1) return result;
        int last=lastOcc(nums,target);
        result[0]=first;
        result[1]=last;
        return result;
    }
}
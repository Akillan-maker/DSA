class Solution {
    public void rotate(int[] nums, int k) {

        k=k%nums.length;
        if(nums.length==1 || nums.length<k){
            return;
        }
        reverse(nums,0,(nums.length-k)-1);
        reverse(nums,nums.length-k,nums.length-1);
        reverse(nums,0,nums.length-1);
    }

    void reverse(int[] nums,int i,int j){

        while(i<=j){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                i++;
                j--;
            }
    }
}
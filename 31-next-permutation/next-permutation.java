class Solution {
    public void nextPermutation(int[] nums) {
        
        int index=-1;
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                index=i;
                break;
            }
        }
        if(index==-1){
           reverse(nums,0,nums.length-1);
            return;
        }

        for(int i=nums.length-1;i>=index;i--){
            if(nums[i]>nums[index]){
                int temp=nums[i];
                nums[i]=nums[index];
                nums[index]=temp;
                reverse(nums,index+1,nums.length-1);
                return;
            }
        }
    }

    void reverse(int[] nums,int i,int j){
        while(i<j){
            int temp=nums[j];
            nums[j]=nums[i];
            nums[i]=temp;
            i++;
            j--;
        }
    }
}
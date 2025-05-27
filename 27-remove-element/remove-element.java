class Solution {
    public int removeElement(int[] nums, int val) {
        
        int count=0;
        int s=0;
        int j=nums.length-1;
        
        while(s<=j){
            if(nums[s]==val){
                if(nums[j] == val) 
                {
                    j-- ;
                    continue;
                }
                int temp=nums[j];
                nums[j]=nums[s];
                nums[s]=temp;
                s++;
                j--;
            }
            else
            {
                s++;
            }
        }
        for(int i=0;i<nums.length;i++){
           if(nums[i]!=val){
            count+=1;
           }
        }
        return count;
    }
}
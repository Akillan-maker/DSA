class Solution {
    public void moveZeroes(int[] nums) {
        
        int j=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                j=i;
                break;
            }
        }
        if(j==-1){
            return ;
        }

        for(int s=j+1;s<nums.length;s++){
            if(nums[s]!=0){
                nums[j]=nums[s];
                nums[s]=0;
                j++;
            }
            
        }
    }
}
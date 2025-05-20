class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int j=0;
        int i=j+1;
        int[] result=new int[2];
        while(nums[j]+nums[i]!=target){
            i++;
            if(i==nums.length){
                j+=1;
                i=j+1;
            }
        }
        result[0]=j;
        result[1]=i;
       
        return result;
    }
}
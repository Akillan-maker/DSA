class Solution {
    public int[] rearrangeArray(int[] nums) {
        
        int[] arr1=new int[nums.length/2];
        int[] arr2=new int[nums.length/2];
        int p=0;
        int n=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                arr2[n]=nums[i];
                n+=1;
            }
            else{
                arr1[p]=nums[i];
                p+=1;
            }
        }
        p=0;
        n=0;
        for(int j=0;j<nums.length;j++){
            if(j%2!=0){
                nums[j]=arr2[n];
                n+=1;
            }
            else{
                nums[j]=arr1[p];
                p+=1;
            }
        }
        return nums;

    }
}
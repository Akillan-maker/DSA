class Solution {
    public int smallestIndex(int[] nums) {
        
        for(int i=0;i<nums.length;i++){

            
            if(nums[i]<10){
                if(nums[i]==i){
                    return i;
                }
            }
            else if(nums[i]>9){
                String temp=String.valueOf(nums[i]);
                int sum=0;
                for(int j=0;j<temp.length();j++){
                    sum+=temp.charAt(j)-'0';
                    System.out.println(sum);
                }
                if(sum==i){
                    return sum;
                }
            }
        }
        return -1;
    }
}
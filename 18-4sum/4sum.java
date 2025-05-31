class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        
        List<List<Integer>> result=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            for(int j=i+1;j<nums.length;j++){
                if(j>i+1 && nums[j]==nums[j-1]) continue;
                int s=j+1;
                int k=nums.length-1;
                // int sum=0;

                while(s<k){
                    long sum=nums[i]+nums[j];
                    sum+=nums[s];
                    sum+=nums[k];

                    if(sum>target){
                        k--;
                    }
                    else if(sum<target){
                        s++;
                    }
                    else if(sum==target){
                        List<Integer> temp=new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[s]);
                        temp.add(nums[k]);
                        result.add(temp);
                        s++;
                        k--;

                        while(s<k && nums[s]==nums[s-1]) s++;
                        while(s<k && nums[k]==nums[k+1]) k--;
                    }
                }
            }
        }
        return result;
    }
}
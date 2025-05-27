class Solution {
    public int subarraySum(int[] nums, int k) {
        int count=0;
        int prefix=0;
        int sum=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);

        for(int i=0;i<nums.length;i++){
            
            prefix+=nums[i];
            sum=prefix-k;

            if(map.containsKey(sum)){
                int temp=map.get(sum);
                count+=temp;
            }
            if(map.containsKey(prefix)){
                int t=map.get(prefix)+1;
                map.put(prefix,t);
            }
            else{
                map.put(prefix,1);
            }
        }
        return count;
    }
}
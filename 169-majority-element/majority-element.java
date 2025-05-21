class Solution {
    public int majorityElement(int[] nums) {
        int max=0;
        HashMap<Integer,Integer> hash=new HashMap<>();

        for(int ele:nums){
            if(hash.containsKey(ele)){
                int temp=hash.get(ele);
                hash.put(ele,temp+1);
            }
            else{
                hash.put(ele,1);
            }
        }

        for(int e:hash.keySet()){
            if(hash.get(e)>nums.length/2){
                return e;
            }
        }
        return 0;
    }
}
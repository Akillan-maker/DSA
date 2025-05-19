class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> hash=new HashMap<>();

        for(int i:nums){
            if(hash.containsKey(i)){
                int temp=hash.get(i);
                hash.put(i,temp+1);
            }
            else{
                hash.put(i,1);
            }
        }
        for(int num:hash.keySet()){
            if(hash.get(num)==1){
                return num;
            }
        }
        return 0;
    }
}
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int[] arr=new int[nums.length+1];
        List<Integer> result=new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            arr[nums[i]]=1;
        }
        for(int j=0;j<arr.length;j++){
            if(j>0 && arr[j]==0){
                result.add(j);
            }
        }
        return result;
    }
}
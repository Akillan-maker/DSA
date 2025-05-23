class Solution {
    public int longestConsecutive(int[] nums) {
        int max=Integer.MIN_VALUE;
       HashSet<Integer> hs=new HashSet<>();
       
       if(nums.length==0){
        return 0;
       }
       for(int ele:nums){
           hs.add(ele);
       }
       for(int e:hs){
           if(!hs.contains(e-1)){
               int count=1;
               int num=e;
               while(hs.contains(num+1)){
                   count+=1;
                   num+=1;
               }
               max=Math.max(max,count);
           }
       }
        
        return max;
    }
}
class Solution {

    // Function to return length of longest subsequence of consecutive integers.
    public int longestConsecutive(int[] arr) {
        // code here
       
       int max=Integer.MIN_VALUE;
       HashSet<Integer> hs=new HashSet<>();
       
       for(int ele:arr){
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
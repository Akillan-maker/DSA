// User function Template for Java

class Solution {
    public int findKRotation(List<Integer> arr) {
        // Code here
        int low=0,high=arr.size()-1;
        int result=Integer.MAX_VALUE;
        int t=-1;
        
        while(low<=high){
            
            int mid=(low+high)/2;
            
            if(arr.get(low)<=arr.get(mid)){
                if(result>arr.get(low)){
                    result=arr.get(low);
                    t=low;
                }
                low=mid+1;
            }
            else{
                 if(result>arr.get(mid)){
                    result=arr.get(mid);
                    t=mid;
                }
                high=mid-1;
            }
        }
        return t;
    }
}
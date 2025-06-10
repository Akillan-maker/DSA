// User function Template for Java

class Solution {
    public int nthRoot(int n, int m) {
        // code here
        int low=1,high=m;
        int result=-1;
        
        while(low<=high){
            
            int mid=(low+high)/2;
            if((long)Math.pow((long)mid,(long)n)==m) return mid;
            else if((long)Math.pow((long)mid,(long)n)>m) high=mid-1;
            else {
                low=mid+1;
            }
        }
        return result;
    }
}
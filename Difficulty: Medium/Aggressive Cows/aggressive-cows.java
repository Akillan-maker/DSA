// User function Template for Java
class Solution {
    
    static boolean canPlace(int[] stalls,int disnt,int totalcows){
        
        int cows=1,lastcow=stalls[0];
        
        for(int i=0;i<stalls.length;i++){
            if(stalls[i]-lastcow>=disnt){
                cows+=1;
                lastcow=stalls[i];
            }
            else continue;
        }
        if(cows>=totalcows){
            return true;
        }
        return false;
        
    }
    public static int aggressiveCows(int[] stalls, int k) {
        // code here
        Arrays.sort(stalls);
        
        int low=0,high=stalls[stalls.length-1]-stalls[0];
        
        while(low<=high){
            
            int mid=(low+high)/2;
            
            if(canPlace(stalls,mid,k)){
                 low=mid+1;
            }
            else high=mid-1;
        }
        return high;
    }
}
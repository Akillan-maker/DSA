class Solution {
    public boolean isPowerOfTwo(int n) {
        
        return power(0,1,n);
    }
    boolean power(int i,double e,int r){
        if(e==r){
            return true;
        }
        if(e>r){
            return false;
        }
        return power(i+1,Math.pow(2,i),r);
    }
    
}
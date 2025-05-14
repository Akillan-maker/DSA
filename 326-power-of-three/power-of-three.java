class Solution {
    public boolean isPowerOfThree(int n) {
        
        return isPower(0,1,n);
    }
    boolean isPower(int i,double p,int n){
        if(p==n){
            return true;
        }
        if(p>n){
            return false;
        }
        return isPower(i+=1,Math.pow(3,i),n);
    }
}
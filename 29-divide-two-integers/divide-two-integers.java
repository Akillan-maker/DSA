class Solution {
    public int divide(int dividend, int divisor) {
         if(dividend==-2147483648 && divisor==-1){
            return Math.abs(dividend)-1;
        }
        return dividend/divisor;
    }
}
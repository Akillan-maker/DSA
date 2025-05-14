class Solution {
    public int fib(int n) {

        return fibanac(n);
    }
    int fibanac(int n){

        if(n<=1){
            return n;
        }
        return fibanac(n-1)+fibanac(n-2);
    }
}
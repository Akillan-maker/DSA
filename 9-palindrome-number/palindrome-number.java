class Solution {
    public boolean isPalindrome(int x) {
        int i=x;
        int result=0;
        boolean bool=false;

        while(x>0){
            int rem=x%10;
            x=x/10;
            result=result*10+rem;
        }
        if(i==result){
            bool=true;
        }
        return bool;
    }
}
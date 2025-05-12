class Solution {
    public int reverse(int x) {
        int result=0;
        boolean bool=false;
        if(x<0){
            x=Math.abs(x);
            bool=true;
        }
        StringBuilder sbo=new StringBuilder(String.valueOf(x));
        String t=sbo.reverse().toString();
        try{
             if(bool==true){
            result=Integer.parseInt(t)*-1;
        }
        else{
            result=Integer.parseInt(t);
        }
        if(result>=Integer.MAX_VALUE || result<=Integer.MIN_VALUE){
            return 0;
        }
        }
                catch(Exception e){
            return 0;
        }
       
        return result;
        
    }
}
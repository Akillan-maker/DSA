class Solution {
    public String removeOuterParentheses(String s) {
        
        int index=-1,count=0;
        String result="";

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                if(count==0) index=i;
                count+=1;
            }
            else count-=1;
            if(count==0){
                result+=s.substring(index+1,i);
            }
        }
        return result;
    }
}
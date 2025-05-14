class Solution {
    public char kthCharacter(int k) {
        
        return kChar("a",0,k);
    }

    char kChar(String s,int len,int k){

        if(len>k){
            return s.charAt(k-1); 
        }
        String temp="";
        for(int i=0;i<s.length();i++){
            char temp1=s.charAt(i);
            ++temp1;
            temp+=temp1;
        }
        s+=temp;
        return kChar(s,s.length(),k);
    }
}
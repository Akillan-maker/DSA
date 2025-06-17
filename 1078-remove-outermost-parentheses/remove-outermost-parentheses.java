class Solution {
    public String removeOuterParentheses(String s) {
        
        ArrayList<String> temp=new ArrayList<>();
        int index=-1,count=0;
        String result="";

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                if(count==0) index=i;
                count+=1;
            }
            else count-=1;
            if(count==0){
                temp.add(s.substring(index+1,i));
            }
        }
        for(String e:temp){
            result+=e;
        }
        
        return result;
    }
}
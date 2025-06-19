class Solution {
    public int maxDepth(String s) {
        
        boolean bool=false;
        int result=-1;
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                bool=true;
                count++;
                result=Math.max(result,count);
            }
            else if(s.charAt(i)==')'){
                count--;
            }
            else continue;
        }
        if(bool) return result;
        return 0;
    }
}
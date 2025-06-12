class Solution {
    public int firstUniqChar(String s) {
        
        for(int i=0;i<s.length();i++){
            char temp=s.charAt(i);
            boolean bool=true;
            for(int j=0;j<s.length();j++){
                if(j==i) continue;
                if(s.charAt(j)==temp){
                    bool=false;
                    break;
                }
            }
            if(bool) return i;
        }
        return -1;
    }
}
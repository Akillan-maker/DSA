class Solution {
    public int strStr(String haystack, String needle) {
        
        int first=-1;
        int n=needle.length();
        for(int i=0;i<haystack.length();i++){
            String result="";
            for(int j=i;j<haystack.length();j++){
                result+=haystack.charAt(j);
                if(result.equals(needle)){
                return i;
            }
            }
            System.out.println(result);
            
        }
        return first;
    }
}
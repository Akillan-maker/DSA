class Solution {
    public String reverseWords(String s) {
        
        String[] reverse=s.trim().split("\\s+");
        String str="";

        for (int i=reverse.length-1;i>=0;i--){
            if (i!=0) {
                str+=reverse[i]+" ";
                continue;
            }
            str+=reverse[i];
        }
        return str;
    }
}
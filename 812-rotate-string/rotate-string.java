class Solution {
    public boolean rotateString(String s, String goal) {
        
        if (s.length() != goal.length()) return false;
        int count=s.length();
        while(count!=0){
            char t=s.charAt(0);
            s=s.substring(1)+t;
            if(s.equals(goal)){
                return true;
            }
            count--;
        }
        return false;

    }
}
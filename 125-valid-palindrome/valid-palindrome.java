class Solution {
    public boolean isPalindrome(String s) {
        // code here
        String st=s.replaceAll("[^a-zA-Z0-9]","");
        st=st.toLowerCase();
        return palindrome(0,st.length()-1,st);
        
    }
    
    boolean palindrome(int i,int r,String p){
        
        if(i>r){
            return true;
        }
        if(p.charAt(i)!=p.charAt(r)){
            return false;
        }
        return palindrome(++i,--r,p);
       
    }
    }

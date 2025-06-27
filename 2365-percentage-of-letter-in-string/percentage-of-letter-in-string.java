class Solution {
    public int percentageLetter(String s, char letter) {
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==letter){
                count+=1;
            }
        }
        if(count==0) return 0;
        double res=((double)count/(double)s.length())*100;
        return (int) res;
    }
}
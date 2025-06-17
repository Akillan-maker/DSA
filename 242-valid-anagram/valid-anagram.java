class Solution {
    public boolean isAnagram(String s, String t) {
        
        if(s.length()!=t.length()) return false;
        HashMap<Character,Integer> letters=new HashMap<>();

        for(int i=0;i<s.length();i++){
            if(letters.containsKey(s.charAt(i))){
                int tem=letters.get(s.charAt(i));
                letters.put(s.charAt(i),++tem);
            }
            else letters.put(s.charAt(i),1);
        }

        for(int j=0;j<t.length();j++){
            if(letters.containsKey(t.charAt(j))){
                int tem=letters.get(t.charAt(j));
                --tem;
                if(tem==0){
                    letters.remove(t.charAt(j));
                    continue;
                }
                letters.put(t.charAt(j),tem);
            }
            else return false;
        }
        return true;
    }
}
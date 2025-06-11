class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> count=new HashMap<>();
        for(int i=0;i<magazine.length();i++){
            if(count.containsKey(magazine.charAt(i))){
                int temp=count.get(magazine.charAt(i));
                count.put(magazine.charAt(i),temp+1);
            }
            else{
                count.put(magazine.charAt(i),0);
            }
        }
        for(int i=0;i<ransomNote.length();i++){
            if(count.containsKey(ransomNote.charAt(i))){
                int temp=count.get(ransomNote.charAt(i));
                 if(temp<=0){
                    count.remove(ransomNote.charAt(i));
                    continue;
                }
                count.put(ransomNote.charAt(i),temp-1);
               
            }
            else{
                return false;
            }
        }
        return true;
    }
}
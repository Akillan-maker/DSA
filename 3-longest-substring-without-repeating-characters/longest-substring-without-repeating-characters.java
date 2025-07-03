class Solution {
    public int lengthOfLongestSubstring(String s) {
        
       if(s.equals("")) return 0;
        int result=Integer.MIN_VALUE;
        for(int i=0;i<s.length();i++){
            HashMap<Character,Integer> map=new HashMap<>();
            int temp=0;
            l:for(int j=i;j<s.length();j++){
                if(!map.containsKey(s.charAt(j))){
                    temp+=1;
                    map.put(s.charAt(j),0);
                }
                else{
                    break l;
                }
            }
            result=Math.max(result,temp);
        }
        return result;
    }
}
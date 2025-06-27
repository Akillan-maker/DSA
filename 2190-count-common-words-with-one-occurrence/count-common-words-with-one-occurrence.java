class Solution {
    public int countWords(String[] words1, String[] words2) {
        
        HashMap<String,Integer> map=new HashMap<>();
        HashMap<String,Integer> map1=new HashMap<>();
        int result=0;
        for(int i=0;i<words1.length;i++){
            if(map.containsKey(words1[i])){
                int temp=map.get(words1[i]);
                map.put(words1[i],++temp);
            }
            else{
                map.put(words1[i],1);
            }
        }
        for(int i=0;i<words2.length;i++){
            if(map1.containsKey(words2[i])){
                int temp=map1.get(words2[i]);
                map1.put(words2[i],++temp);
            }
            else{
                map1.put(words2[i],1);
            }
        }
        for(String ele:map.keySet()){
            if(map1.containsKey(ele)){
                if(map.get(ele)==1 && map1.get(ele)==1){
                    result+=1;
                }
            }
        }
        return result;
    }
}
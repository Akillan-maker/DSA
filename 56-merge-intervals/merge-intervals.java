class Solution {
    public int[][] merge(int[][] intervals) {
        
        Comparator<int[]> obj=new Comparator<>(){
            public int compare(int[] obj1,int[] obj2){
                int diff=Integer.compare(obj1[0],obj2[0]);
                return diff;
            }
        };
        Arrays.sort(intervals,obj);

        int[][] result=new int[intervals.length][2];
        int index=0;
        
        for(int i=0;i<intervals.length;i++){
            int s=intervals[i][0];
            int e=intervals[i][1];
            if(index==0 || result[index-1][1]<intervals[i][0]){
                result[index][0]=s;
                result[index][1]=e;
                index++;
            }
            else{
                result[index-1][1]=Math.max(intervals[i][1],result[index-1][1]);
            }
        }
        return Arrays.copyOf(result,index);
    }
}
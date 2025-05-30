class Solution {
    public List<Integer> generateRow(int row){

        List<Integer> temp=new ArrayList<>();
        int e=1;
        temp.add(1);
        for(int i=1;i<row;i++){
            e=e*(row-i);
            e=e/(i);
            temp.add(e);
        }
        return temp;
    }
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> result=new ArrayList<>();
        for(int i=1;i<=numRows;i++){
            result.add(generateRow(i));
        }
        return result;
    }
}
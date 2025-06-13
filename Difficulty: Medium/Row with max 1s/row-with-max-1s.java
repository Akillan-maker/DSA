// User function Template for Java

class Solution {
    public int rowWithMax1s(int arr[][]) {
        // code here
        int com=-1;
        int result=-1;
        for(int i=0;i<arr.length;i++){
            int count=0;
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==1){
                    count+=1;
                }
            }
            if(count>com){
                com=count;
                result=i;
            }
        }
        return result;
    }
}
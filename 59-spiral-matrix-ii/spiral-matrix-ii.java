class Solution {
    public int[][] generateMatrix(int n) {
        
        int[][] matrix=new int[n][n];
        int top=0,left=0;
        int right=n-1,bottom=n-1;
        int ele=1;
        
        while(top<=bottom && left<=right){

            for(int i=left;i<=right;i++){
                matrix[top][i]=ele;
                ele++;
            }
            top++;
            for(int i=top;i<=bottom;i++){
                matrix[i][right]=ele;
                ele++;
            }
            right--;
            if(top<=bottom){
            for(int i=right;i>=left;i--){
                    matrix[bottom][i]=ele;
                    ele++;
                }
                bottom--;
           }
            if(left<=right){
                 for(int i=bottom;i>=top;i--){
                    matrix[i][left]=ele;
                    ele++;
                }
                left++;
            }
           
        }
        return matrix;
    }
}
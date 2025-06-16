class Solution {
    int maxxi(int[][] mat,int n,int m,int col){
        int max=Integer.MIN_VALUE;
        int r=-1;
        for(int i=0;i<=n;i++){
            if(mat[i][col]>=max){
                max=mat[i][col];
                r=i;
            }
        }
        return r;
    }
    public int[] findPeakGrid(int[][] mat) {
        
        int n=mat.length-1;
        int m=mat[0].length-1;
        int low=0,high=m;
        int[] result=new int[2];

        while(low<=high){

            int mid=(low+high)/2;
            int row=maxxi(mat,n,m,mid);
            int left=mid-1;
            if(left>=0){
                left=mat[row][left];
            }
            else left=-1;
            int right=mid+1;
            if(right<=m){
                right=mat[row][right];
            }
            else right=-1;

            if(left<mat[row][mid] && right<mat[row][mid]){
                result[0]=row;
                result[1]=mid;
                return result;
            }
            else if(left>mat[row][mid]) high=mid-1;
            else low=mid+1;
        }
        return result;
    }
}
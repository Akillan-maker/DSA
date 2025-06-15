class Solution {

    // boolean bs(int[] arr,int target){

    //     int low=0,high=arr.length-1;
        
    //     while(low<=high){
    //         int mid=(low+high)/2;

    //         if(arr[mid]==target) return true;
    //         if(arr[mid]>target) high=mid-1;
    //         else low=mid+1;
    //     }
    //     return false;
    // }
    public boolean searchMatrix(int[][] matrix, int target) {
        
       int n=matrix.length,m=matrix[0].length;
       int low=0,high=(n*m)-1;

       while(low<=high){

        int mid=(low+high)/2;
        int row=mid/m;
        int col=mid%m;

        if(matrix[row][col]==target) return true;
        else if(matrix[row][col]>target) high=mid-1;
        else low=mid+1;
       }
        return false;
    }
}
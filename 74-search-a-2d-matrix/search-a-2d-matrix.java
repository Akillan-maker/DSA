class Solution {

    boolean bs(int[] arr,int target){

        int low=0,high=arr.length-1;
        
        while(low<=high){
            int mid=(low+high)/2;

            if(arr[mid]==target) return true;
            if(arr[mid]>target) high=mid-1;
            else low=mid+1;
        }
        return false;
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        
        for(int i=0;i<matrix.length;i++){
            if(matrix[i][0]<=target && matrix[i][matrix[i].length-1]>=target){
                return bs(matrix[i],target);
            }
        }
        return false;
    }
}
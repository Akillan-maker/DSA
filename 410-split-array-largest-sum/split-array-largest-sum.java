class Solution {
     int noOfStudents(int[] arr,int pages){
        
        int students=1;
        long curpage=0;
        
        for(int i=0;i<arr.length;i++){
            if(curpage+arr[i]<=pages){
                curpage+=arr[i];
            }
            else{
                students+=1;
                curpage=arr[i];
            }
        }
        return students;
    }
    public int splitArray(int[] arr, int k) {
        if(arr.length<k) return -1;
        
        int low=Integer.MIN_VALUE,high=0;
        for(int i=0;i<arr.length;i++){
            low=Math.max(low,arr[i]);
            high+=arr[i];
        }
        
        while(low<=high){
            
            int mid=(low+high)/2;
            int students=noOfStudents(arr,mid);
            
            if(students>k){
                low=mid+1;
            }
            else high=mid-1;
        }
        return low;
    }
}
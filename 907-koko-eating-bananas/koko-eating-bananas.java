class Solution {

    int Max(int[] arr){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            max=Math.max(max,arr[i]);
        }
        return max;
    }
    int hrsTaken(int[] arr,int hrs){
        int hrst=0;
        for(int i=0;i<arr.length;i++){
            hrst+=Math.ceil((double)arr[i]/(double)hrs);
        }
        return hrst;

    }
    public int minEatingSpeed(int[] piles, int h) {
        
        int low=0,high=Max(piles);
        int result=0;

        while(low<=high){
        int mid=(low+high)/2;
        int totalHrs=hrsTaken(piles,mid);
        
         if(totalHrs<=h){
             result=mid;
            high=mid-1;
        }
        else {
           
            low=mid+1;
            }
        }
        return result;
    }
}
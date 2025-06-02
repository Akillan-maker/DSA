class Solution {

     void merge(int arr[],int low,int mid,int high){
        
        int left=low;
        int right=mid+1;
        ArrayList<Integer> temp=new ArrayList<>();
        
        while(left<=mid && right<=high){
            if(arr[left]<=arr[right]){
                temp.add(arr[left]);
                left++;
            }
            else{
                temp.add(arr[right]);
                right++;
            }
        }
        while(left<=mid){
            temp.add(arr[left]);
                left++;
        }
        while(right<=high){
            temp.add(arr[right]);
                right++;
        }
        for(int i=low;i<=high;i++){
            arr[i]=temp.get(i-low);
        }
    }

    int countC(int arr[],int low,int mid,int high){

        int count=0;
        int right=mid+1;

        for(int i=low;i<=mid;i++){
            while(right<=high && arr[i]>(long)2*(long)arr[right]) right++;
            count+=(right-(mid+1));
        }
        return count;
    }

    int mergeSort(int arr[], int l, int r) {
        // code here
        int count=0;
        if(l==r){
            return count;
        }
        int mid=(l+r)/2;
        count+=mergeSort(arr,l,mid);
        count+=mergeSort(arr,mid+1,r);
        count+=countC(arr,l,mid,r);
        merge(arr,l,mid,r);

        return count;
    }
    
    public int reversePairs(int[] nums) {
        
        return mergeSort(nums,0,nums.length-1);
        
    }
}
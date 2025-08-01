class Solution {
    
    void merge(int arr[],int low,int mid,int high){
        
        int left=low;
        int right=mid+1;
        ArrayList<Integer> temp=new ArrayList<>();
        
        while(left<=mid && right<=high){
            if(arr[left]<arr[right]){
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

    void mergeSort(int arr[], int l, int r) {
        // code here
        if(l==r){
            return;
        }
        int mid=(l+r)/2;
        mergeSort(arr,l,mid);
        mergeSort(arr,mid+1,r);
        merge(arr,l,mid,r);
    }
    
}
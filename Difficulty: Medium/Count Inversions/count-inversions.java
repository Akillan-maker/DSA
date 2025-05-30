// User function Template for Java

class Solution {
    // Function to count inversions in the array.
    static int merge(int arr[],int low,int mid,int high){
        
        int count=0;
        int left=low,right=mid+1;
        ArrayList<Integer> temp=new ArrayList<>();
        
        while(left<=mid && right<=high){
            if(arr[left]<=arr[right]){
                temp.add(arr[left]);
                left++;
            }
            else{
                temp.add(arr[right]);
                count+=(mid-left+1);
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
        return count;
    }
    
    static int mergeSort(int arr[],int low,int high){
        int count=0;
        if(low==high) return count;
        
        int mid=(low+high)/2;
        
        count+=mergeSort(arr,low,mid);
        count+=mergeSort(arr,mid+1,high);
        count+=merge(arr,low,mid,high);
        
        return count;
    }
    static int inversionCount(int arr[]) {
        // Your Code Here
        return mergeSort(arr,0,arr.length-1);
        }
       
    }

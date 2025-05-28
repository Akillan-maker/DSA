// User function Template for Java

class Solution {
    // Function to merge the arrays.
    public void mergeArrays(int a[], int b[]) {
        // code here
        int n=a.length,m=b.length;
        int right=0;
        int left=a.length-1;
        
        while(left>=0 && right<m){
            if(a[left]>b[right]){
                int temp=a[left];
                a[left]=b[right];
                b[right]=temp;
                left--;
                right++;
            }
            else{
                break;
            }
        }
        Arrays.sort(a);
        Arrays.sort(b);
    }
}

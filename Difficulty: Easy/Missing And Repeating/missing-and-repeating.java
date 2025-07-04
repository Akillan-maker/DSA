// User function Template for Java

class Solution {
    // Function to find two elements in array
    ArrayList<Integer> findTwoElement(int arr[]) {
        // code here
        ArrayList<Integer> result=new ArrayList<>();
        long n=arr.length;
        long sn=(n*(n+1))/2;
        long s2n=(n*(n+1)*(2*n+1))/6;
        long s=0,s2=0;
        for(int i=0;i<arr.length;i++){
            s+=(long)arr[i];
            s2+=(long)arr[i]*(long)arr[i];
        }
        long val1=s-sn;
        long val2=s2-s2n;
        val2=val2/val1;
        long x=(val1+val2)/2;
        long y=x-val1;
        result.add((int)x);
        result.add((int)y);
        return result;
    }
}

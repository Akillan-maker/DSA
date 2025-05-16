//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String[] arr1Str = sc.nextLine().split(" ");
            int[] arr = Arrays.stream(arr1Str).mapToInt(Integer::parseInt).toArray();
            Solution ob = new Solution();
            int ans = ob.getSecondLargest(arr);
            System.out.println(ans);

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        
        int max=Integer.MIN_VALUE;
        int s=Integer.MIN_VALUE;
        
        for(int i=0;i<arr.length;i++){
            
            if(arr[i]==max){
                continue;
            }
            else{
                if(arr[i]>max){
                    s=max;
                    max=arr[i];
                }
                else{
                    s=Math.max(arr[i],s);
                }
            }
        }
        if(s==Integer.MIN_VALUE){
            return -1;
        }

        return s;
    }
}
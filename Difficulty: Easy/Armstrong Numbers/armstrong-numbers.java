//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            boolean flag = ob.armstrongNumber(n);
            if (flag) {
                System.out.println("true");

            } else {
                System.out.println("false");
            }

            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java
class Solution {
    static boolean armstrongNumber(int n) {
        // code here
        boolean bool=false;
        int x=n;
        int sum=0;
        int p=String.valueOf(n).length();
        while(x>0){
            int rem=x%10;
            x=x/10;
            sum+=Math.pow(rem,p);
        }
        if(n==sum){
            return true;
        }
        return bool;
    }
}
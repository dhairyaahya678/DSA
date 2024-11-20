//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.isStrong(N));
        
System.out.println("~");
}
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static int isStrong(int N) {
        // code here
        int or=N;
        int sum=0;
        while(0<N){
            int rem = N%10;
            sum+=fac(rem);
            N=N/10;
        }
        if(sum==or){
            return 1;
        }
        return 0;
    }
    static int fac(int rem){
        int ans=1;
        for(int i=1;i<=rem;i++){
            ans=ans*i;
        }
        return ans;
    }
};
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
            String S[] = read.readLine().split(" ");
            
            int N = Integer.parseInt(S[0]);
            int M = Integer.parseInt(S[1]);

            Solution ob = new Solution();
            System.out.println(ob.closestNumber(N,M));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static int closestNumber(int N , int M) {
        // code here
         int prev = N, next = N;

        // Loop to find the closest multiple of M
        while (true) {
            if (prev % M == 0) return prev; // If prev is divisible by M, return it
            if (next % M == 0) return next; // If next is divisible by M, return it
            prev--;  // Move one step down
            next++;  // Move one step up
        }
        
    }
};
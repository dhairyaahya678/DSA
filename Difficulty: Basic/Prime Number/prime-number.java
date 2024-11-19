//{ Driver Code Starts


import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine()); // Read number of test cases

        while (t-- > 0) {
            int n =
                Integer.parseInt(read.readLine()); // Read the number to check primality
            Solution ob = new Solution();
            if (ob.isPrime(n)) {
                System.out.println("true"); // If the number is prime, print "true"
            } else {
                System.out.println(
                    "false"); // If the number is not prime, print "false"
            }
            System.out.println("~"); // If the number is not prime, print "false"
        }
    }
}

// } Driver Code Ends


class Solution {
    static boolean isPrime(int n) {
        // code here
        int cnt = 0;

        // Loop through numbers from 1
        // to the square root of n.
        for(int i = 1; i <= Math.sqrt(n); i++){ 

            // If n is divisible by i
            // without any remainder.
            if(n % i == 0){ 

                // Increment the counter.
                cnt = cnt + 1;

                // If n is not a perfect square,
                // count its reciprocal factor.
                if(n / i != i){
                    cnt = cnt + 1;
                }
            }
        }

        // If the number of
        // factors is exactly 2.
        if(cnt == 2){
             // Return true, indicating
             // that the number is prime.
            return true;
        }
        // If the number of
        // factors is not 2.
        else{ 
            // Return false, indicating
            // that the number is not prime.
            return false; 
        }
    }
}
//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long N = sc.nextLong();

            Solution ob = new Solution();
            ArrayList<Long> ans = ob.factorialNumbers(N);
            for (long num : ans) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


// User function Template for Java
class Solution {
    public static ArrayList<Long> factorialNumbers(long n) {
        
        
        ArrayList <Long> list = new ArrayList<>();
        long i = 1;
        
        while(true){
            long fact = factorial(i);
            if(factorial(i)<=n){
                list.add(fact);
                i++;
            }
            else{
                break;
            }
        }
        return list;
         
    }
    public static long factorial(long num){
        if(num==0){
            return 1;
        }
        return num * factorial(num-1);
        // code here
    }
        
}
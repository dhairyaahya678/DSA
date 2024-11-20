//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            Solution ob = new Solution();
            String ans = ob.is_AutomorphicNumber(n);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public String is_AutomorphicNumber(int n)
    {
        // Code here
        String a = Integer.toString(n);
        int sq = n*n;
        String b = Integer.toString(sq);
        
        
        return (b.charAt(b.length()-1) == a.charAt(a.length() - 1)) ? "Automorphic" : "Not Automorphic";
    }
}
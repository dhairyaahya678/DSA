//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    int n = sc.nextInt();
                    int m = sc.nextInt();
                    int a[] = new int[n];
                    int b[] = new int[m];
                    for(int i = 0;i<n;i++)
                        a[i] = sc.nextInt();
                    for(int i = 0;i<m;i++)
                        b[i] = sc.nextInt();    
                    Solution ob = new Solution();
                    System.out.println(ob.maxDotProduct(n, m, a, b));
                }
        }
}    
// } Driver Code Ends


//User function Template for Java

class Solution
{
	public int maxDotProduct(int n, int m, int a[], int b[])  { 
		// Your code goes here
		Integer[][] dp = new Integer[n][m];
		return helper(a, b, 0, 0, 0, dp);
	}
	
	public int helper(int[] a, int[] b, int ai, int bi, int skip, Integer[][] dp) {
	    if(ai >= a.length || bi >= b.length) return 0;
	    
        if(dp[ai][bi] != null) return dp[ai][bi];
	    
	    int take = 0, notTake = 0;
	    
	    take = (a[ai]*b[bi]) + helper(a, b, ai+1, bi+1, skip, dp);
	    
	    if(skip < a.length-b.length) notTake = helper(a, b, ai+1, bi, skip+1, dp);
	    
	    return dp[ai][bi] = Math.max(take, notTake);
	}
}

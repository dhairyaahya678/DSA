//{ Driver Code Starts

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
            String [] S1 = br.readLine().trim().split(" ");
            int A = Integer.parseInt(S1[0]);
            int B = Integer.parseInt(S1[1]);
            int C = Integer.parseInt(S1[2]);
            Solution ob = new Solution();
            double[] ans = ob.FindRoots(A, B, C);
            if(ans.length == 1){
                System.out.println((int)ans[0]);
                continue;
            }
            for(int i = 0; i < ans.length; i++)
                System.out.print(String.format("%6f", ans[i]) + " ");
            System.out.println();
        }
    }
}

// } Driver Code Ends



class Solution
{
    public double[]  FindRoots(int a, int b, int c)
    {
        // code here
        double d = (b * b) - (4.0 * a * c);

        if (d >= 0) { // Real roots
            double sqrtD = Math.sqrt(d);
            double r1 = (-b + sqrtD) / (2.0 * a);
            double r2 = (-b - sqrtD) / (2.0 * a);
            
            // Return roots in ascending order
            return new double[]{Math.min(r1, r2), Math.max(r1, r2)};
        } else { // No real roots
            return new double[]{-1};
        }
    }
}
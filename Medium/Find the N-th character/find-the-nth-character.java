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
                    String S = sc.next();
                    int R = sc.nextInt();
                    int N = sc.nextInt();
                    Solution obj = new Solution();
                    System.out.println(obj.nthCharacter(S,R,N));
                }
                
        }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public char nthCharacter(String s, int r, int n)
    {
        String newa = "";
        for(int i = 0; i<r; i++){
            newa = "";
            
            for(int j =0; j<=n; j++){
                if(s.charAt(j)=='0') {
                    newa+="01";
                }
                else{
                    newa+="10";
                }
          
            }s=newa;
        }
        return newa.charAt(n);
    }
}
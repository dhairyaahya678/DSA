//{ Driver Code Starts
//Initial Template for Java


import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.evenlyDivides(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java


class Solution{
    static int evenlyDivides(int N){
        String s = Integer.toString(N);
        int count = 0;
        for(char c : s.toCharArray()){
            int n = Character.getNumericValue(c);
            if(n != 0 && N%n == 0){
                count++;
            }
        }
        return count;
    }
}
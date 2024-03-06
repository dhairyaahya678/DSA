//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            String s, patt;
            s = sc.next();
            patt = sc.next();
            
            Solution ob = new Solution();
            
            ArrayList<Integer> res = ob.search(patt, s);
            
            for(int i = 0;i<res.size();i++)
                System.out.print(res.get(i) + " ");
            System.out.println();    
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    
    ArrayList<Integer> search(String pattern, String text)
    {
        ArrayList<Integer> indices = new ArrayList<>();
        int m = pattern.length();
        int n = text.length();

        int p = 0;
        int t = 0;
        for (int i = 0; i < m; i++) {
            p += pattern.charAt(i) - 'a';
            t += text.charAt(i) - 'a';
        }
        
        for (int i = 0; i <= n - m; i++) {
            if (p == t) {
                boolean match = true;
                for (int j = 0; j < m; j++) {
                    if (pattern.charAt(j) != text.charAt(i + j)) {
                        match = false;
                        break;
                    }
                }
                if (match) {
                    indices.add(i + 1); 
                }
            }
            
            if (i < n - m) {
                t -= text.charAt(i) - 'a';
                t += text.charAt(i + m) - 'a';
            }
        }
        
        return indices;
    }
}
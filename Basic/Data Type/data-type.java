//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            sc.nextLine();
            String s = sc.next();
            Solution obj = new Solution();
            int ans = obj.dataTypeSize(s);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    static int dataTypeSize(String str) {
        
        char ch=str.charAt(0);
        switch(ch){
            case 'C':
                return 1;
                
                
            case 'I':
                return (Integer.SIZE)/8;
                
                
            case 'L':
                return (Long.SIZE)/8;
                
                
            case 'F':
                return (Float.SIZE)/8;
                
            
            default:
                return 8;
        }
    }
}
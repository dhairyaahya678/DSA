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
            String s = read.readLine();
            
            Solution ob = new Solution();
            String result = ob.removeVowels(s);
            
            System.out.println(result);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    String removeVowels(String s) {
        // code here
        StringBuilder sb = new StringBuilder();
        String vo = "aeiouAEIOU";
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(vo.indexOf(c)==-1){
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
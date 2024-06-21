//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class GFG {
    public static void main(String args[]) throws IOException {

        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        Solution ob = new Solution();
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String str = read.readLine().trim();
            String ans = ob.compareFrac(str);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {

    String compareFrac(String str) {

        String[] fractions = str.split(", ");


        String[] fraction1 = fractions[0].split("/");
        String[] fraction2 = fractions[1].split("/");

        double a = Double.parseDouble(fraction1[0]);
        double b = Double.parseDouble(fraction1[1]);
        double c = Double.parseDouble(fraction2[0]);
        double d = Double.parseDouble(fraction2[1]);

        double value1 = a / b;
        double value2 = c / d;
        
        if (value1 > value2) {
            return fractions[0];
        } 
        else if (value2 > value1) {
            return fractions[1];
        } 
        else {
            return "equal";
        }
        
    }
}

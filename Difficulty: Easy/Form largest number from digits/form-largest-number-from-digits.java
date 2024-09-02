//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

            String line = br.readLine();
            String[] tokens = line.split(" ");

            // Create an ArrayList to store the integers
            ArrayList<Integer> array = new ArrayList<>();

            // Parse the tokens into integers and add to the array
            for (String token : tokens) {
                array.add(Integer.parseInt(token));
            }

            int[] arr = new int[array.size()];
            int idx = 0;
            for (int i : array) arr[idx++] = i;

            Solution ob = new Solution();
            System.out.println(ob.MaxNumber(arr));
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {

    public String MaxNumber(int arr[]) {
        // code here.
        StringBuilder sb = new StringBuilder();
        Arrays.sort(arr);
        for(int i:arr){
            sb.append(Integer.toString(i));
        }
        sb.reverse();
        
        return sb.toString();
    }
}
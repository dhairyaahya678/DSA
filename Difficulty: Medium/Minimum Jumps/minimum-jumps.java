//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            int size = Integer.parseInt(br.readLine());
            String[] arrStr = ((String)br.readLine()).split("\\s+");
            int[] arr = new int[size];
            for (int i = 0; i < size; i++) {
                arr[i] = Integer.parseInt(arrStr[i]);
            }
            System.out.println(new Solution().minJumps(arr, size));
        }
    }
}

// } Driver Code Ends


class Solution {
    static int minJumps(int[] arr, int n) {
        // your code here
        if (n <= 1) return 0; // If the array length is 0 or 1, no jumps needed
        
        // Initialize variables to keep track of the farthest index we can reach,
        // the current end of the jump, and the number of jumps made.
        int jumps = 0;
        int curEnd = 0;
        int farthest = 0;
        
        for (int i = 0; i < n - 1; i++) {
            // Update the farthest index we can reach from the current index
            farthest = Math.max(farthest, i + arr[i]);
            
            // If we reach the end of the current jump range, make a jump
            if (i == curEnd) {
                jumps++;
                curEnd = farthest;
                
                // If at any point the current end surpasses or reaches the last index,
                // return the number of jumps made
                if (curEnd >= n - 1) {
                    return jumps;
                }
                
                // If we can't move forward from a point (arr[i] == 0) and we're stuck,
                // return -1 indicating it's not possible to reach the end
                if (i == curEnd && arr[i] == 0) {
                    return -1;
                }
            }
        }
        
        return jumps;
            
    }
}
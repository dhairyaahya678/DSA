//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            int[][] arr = new int[n][2];
            for (int i = 0; i < n; i++) {
                String temp[] = br.readLine().trim().split(" ");
                arr[i][0] = Integer.parseInt(temp[0]);
                String x = temp[1];
                arr[i][1] = Integer.parseInt(x);
            }
            Solution obj = new Solution();
            boolean ans = obj.canAttend(arr);
            if (ans)
                System.out.println("true");
            else
                System.out.println("false");
        }
    }
}
// } Driver Code Ends


class Solution {
    static boolean canAttend(int[][] arr) {
        // Your code here
        HashSet<Integer>hs=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            while(arr[i][0]<arr[i][1]){
               arr[i][0]++;
               if(hs.contains(arr[i][0])){
                   return false;
               }
               else{
                   hs.add(arr[i][0]);
               }
            }
            
        }
        return true;
    }
}
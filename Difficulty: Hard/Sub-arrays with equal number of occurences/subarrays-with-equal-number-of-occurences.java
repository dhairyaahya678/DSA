//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;
import java.util.HashMap;


// } Driver Code Ends
// User function Template for Java

class Solution {

    static int sameOccurrence(int arr[], int x, int y) {
        // write code here
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        
        int xCount = 0;
        int yCount = 0;
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == x){
                xCount++;
            }
            if(arr[i] == y){
                yCount++;
            }
            
            int diff = xCount - yCount;
            
            if(map.containsKey(diff)){
                count+=map.get(diff);
            }
            
            map.put(diff,map.getOrDefault(diff,0)+1);
        }
        return count;
        
    }
}

//{ Driver Code Starts.
public class Main {

    public static void main(String[] args) throws Exception {
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

            int x = Integer.parseInt(br.readLine());
            int y = Integer.parseInt(br.readLine());
            // Create Solution object and find closest sum
            Solution ob = new Solution();
            int ans = ob.sameOccurrence(arr, x, y);
            System.out.println(ans);
            System.out.println("~");
        }
    }
}

// } Driver Code Ends
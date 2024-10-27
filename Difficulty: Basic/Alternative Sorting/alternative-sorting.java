//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while (t-- > 0) {

            ArrayList<Integer> array1 = new ArrayList<Integer>();
            String line = read.readLine();
            String[] tokens = line.split(" ");
            for (String token : tokens) {
                array1.add(Integer.parseInt(token));
            }
            ArrayList<Integer> v = new ArrayList<Integer>();
            int[] arr = new int[array1.size()];
            int idx = 0;
            for (int i : array1) arr[idx++] = i;

            v = new Solution().alternateSort(arr);

            for (int i = 0; i < v.size(); i++) System.out.print(v.get(i) + " ");

            System.out.println();
            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public static ArrayList<Integer> alternateSort(int[] arr) {
        //sorted so first element is smallest and the last element is largest
         Arrays.sort(arr);
         //Two pointers to insert 2 numbers at the same time.
         int left=0;
         int right=arr.length-1;
         //answer to store linkedlist value as 1st largest and 1st smallest and so on..
         ArrayList<Integer> answer=new ArrayList<>();
         while(left<right)
         {
             answer.add(arr[right]);
             answer.add(arr[left]);
             left++;
             right--;
         }

         if(left==right) 
           answer.add(arr[left]); 
         return answer;
    }
}

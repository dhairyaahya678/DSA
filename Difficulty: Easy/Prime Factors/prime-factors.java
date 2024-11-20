//{ Driver Code Starts


import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int N = Integer.parseInt(br.readLine().trim());
            Solution ob = new Solution();
            int[] ans = ob.AllPrimeFactors(N);
            for(int i = 0; i < ans.length; i++)
                System.out.print(ans[i] + " ");
            System.out.println();
        }
    }
}

// } Driver Code Ends




class Solution
{
    public int[] AllPrimeFactors(int N)
    {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        for(int p=2;p<=N;p++){
            if(N%p==0 && isPrime(p)){
                list.add(p);
            }
        }
        int w = list.size();
        int arr[] = new int[w];
        for(int i=0;i<w;i++){
            arr[i]=list.get(i);
        }
        return arr;
    }
    public static boolean isPrime(int p){
        if(p==1){
            return false;
        }
        int c=0;
        for(int i=2;i<=p;i++){
            if(p%i==0){
                c++;
            }
        }
        if(c==1){
            return true;
        }
        else{
            return false;
        }
    }
}
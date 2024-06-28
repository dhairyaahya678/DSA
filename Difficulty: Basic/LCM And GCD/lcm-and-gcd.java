//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S[] = read.readLine().split(" ");
            Long A = Long.parseLong(S[0]);
            Long B = Long.parseLong(S[1]);

            Solution ob = new Solution();
            Long[] ptr = ob.lcmAndGcd(A,B);
            
            System.out.print(ptr[0]);
            System.out.print(" ");
            System.out.println(ptr[1]);
        }
    }
}
// } Driver Code Ends


class Solution {
    static Long[] lcmAndGcd(Long A , Long B) {
        // code here
        Long oa = A;
        Long ob = B;
        Long rem;
        
        while(A%B!=0){
            rem = A%B;
            A=B;
            B= rem;
        }
        
        Long gcd = B;
        Long lcm = (oa*ob) / gcd;
        
        // ArrayList<Long> list = new ArrayList<>();
        // list.add(lcm);
        // list.add(gcd);
        
        // Long[] result = new Long[list.size()];
        // result = list.toArray(result);
        
        // return result;
        
        Long [] list = new Long[2];
        list[0] = lcm;
        list[1] = gcd;
        
        return list;
    }
};
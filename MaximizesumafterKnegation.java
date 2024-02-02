import java.util.Arrays;
import java.util.Scanner;

class Solution {
    public long maximizeSum(long a[], int n, int k)
    {
        
        Arrays.sort(a);
        
        for (int i = 0; i < n && k > 0 && a[i] < 0; i++) {
            a[i] = -a[i];
            k--;
        }

        
        if (k % 2 != 0) {
            Arrays.sort(a);
            a[0] = -a[0];
        }

        long maxSum = 0;
        for (int i = 0; i < n; i++) {
            maxSum += a[i];
        }

        return maxSum;
    }
}

public class MaximizesumafterKnegation {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            long[] a = new long[n];
            
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }
            
            Solution obj = new Solution();
            System.out.println(obj.maximizeSum(a, n, k));
        }
    }
}

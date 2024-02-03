

//User function Template for Java

import java.util.Arrays;

public class smallestsubsetwithgivensum{
    public static int minSubset(int[] Arr,int N) { 
        Arrays.sort(Arr);
        long sum = 0;
        for (int i : Arr)
            sum += (long)i;

        int count = 0;
        long sum2 = 0;
        for (int i = N - 1; i >= 0; i--) {
            count++;
            sum -= Arr[i];
            sum2 += Arr[i];
            if (sum2 > sum)
                break;
        }
        return count;
    }


public static void main(String args[]){

    int Arr[] = {2,17,7,3};
    System.out.println(minSubset(Arr, 4));


}
}

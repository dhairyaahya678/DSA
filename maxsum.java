import java.util.HashMap;

class Solution {
    // Create a HashMap to store previously computed maximum sums
    private HashMap<Integer, Integer> dp = new HashMap<>();

    public int maxSum(int n) {
        // Base case: If n is 0, return 0
        if (n == 0) {
            return 0;
        }
        
        // If the maximum sum for n is already computed, return it
        if (dp.containsKey(n)) {
            return dp.get(n);
        }
        
        // Calculate the maximum sum recursively by dividing n into parts n/2, n/3, and n/4
        int max_sum = Math.max(n, maxSum(n / 2) + maxSum(n / 3) + maxSum(n / 4));
        
        // Store the maximum sum in the HashMap
        dp.put(n, max_sum);
        
        // Return the maximum sum
        return max_sum;
    }
}

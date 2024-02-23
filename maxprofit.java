
class Solution {
    public static int maxProfit(int n, int[] price) {
        if (n <= 1) {
            return 0;
        }
        
        int[] left = new int[n];
        int[] right = new int[n];
        
        int min = price[0];
        for (int i = 1; i < n; i++) {
            min = Math.min(min, price[i]);
            left[i] = Math.max(left[i - 1], price[i] - min);
        }
        
        int max = price[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            max = Math.max(max, price[i]);
            right[i] = Math.max(right[i + 1], max - price[i]);
        }
        
        int maxProfit = 0;
        for (int i = 0; i < n; i++) {
            maxProfit = Math.max(maxProfit, left[i] + right[i]);
        }
        
        return maxProfit;
    }
}
        

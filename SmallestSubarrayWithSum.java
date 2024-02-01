public class SmallestSubarrayWithSum {

    static int smallestSubWithSum(int[] arr, int n, int x) {
        int start = 0, end = 0;
        int minLen = Integer.MAX_VALUE;
        int currSum = 0;

        while (end < n) {
            while (currSum <= x && end < n) {
                currSum += arr[end];
                end++;
            }

            while (currSum > x && start < n) {
                minLen = Math.min(minLen, end - start);
                currSum -= arr[start];
                start++;
            }
        }

        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }

    public static void main(String[] args) {
        
        int[] arr1 = {1, 4, 45, 6, 0, 19};
        int x1 = 51;
        System.out.println(smallestSubWithSum(arr1, arr1.length, x1));  

        /*int[] arr2 = {1, 10, 5, 2, 7};
        int x2 = 9;
        System.out.println(smallestSubWithSum(arr2, arr2.length, x2));  */
    }
}

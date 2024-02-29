
class Solution {
    long sumBitDifferences(int[] arr, int n) {
    long count = 0;

    for (int i = 0; i < 32; i++) { 
        int countSet = 0;

        for (int num : arr) {
            if ((num >> i & 1) == 1) {
                countSet++;
            }
        }
        count += (countSet * (long) (n - countSet)) * 2; 
    }
    return count;
    }
}

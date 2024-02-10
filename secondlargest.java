class Solution {
    int print2largest(int arr[], int n) {
        Arrays.sort(arr); 
        
        int largest = arr[n - 1]; 
        for (int i = n - 2; i >= 0; i--) {
           
            if (arr[i] != largest) {
                return arr[i];
            }
        }
        
        return -1; 
    }
}

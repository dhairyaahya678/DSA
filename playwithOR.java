class Solution{
    
   
    
    public static int[] game_with_number (int arr[], int n) {
        int i = 0;
        while(i<n-1){
            arr[i] = arr[i] | arr[i+1];
            i++;
        }return arr;
    }
    
    
}

int maxIndexDiff(int a[], int n) 
    { 
        int[] leftMin = new int[n];
        int[] rightMax = new int[n];
        
        leftMin[0] = a[0];
        for(int i = 1; i < n; i++){
            leftMin[i] = Math.min(leftMin[i-1], a[i]);
        }
        
        rightMax[n-1] = a[n-1];
        for(int i = n-2; i >= 0; i--){
            rightMax[i] = Math.max(rightMax[i+1], a[i]);
        }
        
        int maxDiff = -1;
        int i = 0, j = 0;
        
        while(i < n && j < n){
            if(leftMin[i] <= rightMax[j]){
                maxDiff = Math.max(maxDiff, j - i);
                j++;
            }
            else{
                i++;
            }
        }
        
        return maxDiff;
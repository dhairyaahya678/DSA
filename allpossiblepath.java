class Solution {
    public int isPossible(int[][] paths) {
        int n = paths.length;
        
        
        for (int i = 0; i < n; i++) {
            int c=0;
            for (int j = 0; j < n; j++) {
                if(paths[i][j]==1)
                c++;
            }
            if(c%2==1)return 0;
        }
        return 1;
    }
}

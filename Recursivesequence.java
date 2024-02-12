

class Solution{
    static long sequence(int n){
        
        long ans = 1, tempa = 2;
        
        for(int i = 2; i<=n;i++){
            
            long tempb = 1;
            for(int j=i; j!=0;j--){
                tempb *= tempa;
                tempb %= 1000000007;
                tempa++;
            }
            ans += tempb;
            ans %= 1000000007;
            
        }
        return ans;
    }
}

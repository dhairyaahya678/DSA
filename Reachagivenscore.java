
class Geeks {
    public long count(int n) {
        long[] d = new long[(int)n + 1];
        d[0] = 1; 
   
        
        for(int i=3; i<=n; i++)
        d[i] += d[i-3];
        
        for(int i=5; i<=n; i++)
        d[i] += d[i-5];
        
        for(int i=10; i<=n; i++)
        d[i] += d[i-10];
        
        return d[n]; 
    }
}
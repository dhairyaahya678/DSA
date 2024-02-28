class Solution{
    int DivisibleByEight(String s){
        int n = s.length();
        if(n>3){
            int lastthree = Integer.parseInt(s.substring(n - 3));
            return (lastthree%8==0) ? 1:-1;
        }
        else 
        return (Integer.parseInt(s)%8==0) ? 1:-1;
        
    }
}
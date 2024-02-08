
class Solution {
    public int minFlips(String S) {
        int flip = 0;
        int i=0,n=S.length();
        
        while(i<n)
        {
            char required_char = i%2==0 ? '1':'0';
            if(S.charAt(i++)==required_char)
            flip++;
        }
        return Math.min(n-flip,flip);
    }
}

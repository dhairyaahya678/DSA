class Solution
{
    public static int wordBreak(int n, String s, ArrayList<String> dictionary )
    {
        int len = s.length();
        boolean[] dp = new boolean[len + 1];
        dp[0] = true; 
        
        Set<String> dict = new HashSet<>(dictionary);
        
        for (int i = 1; i <= len; i++) {
            for (int j = 0; j < i; j++) {
                if (dp[j] && dict.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }
        
        return dp[len] ? 1 : 0;

    }
}
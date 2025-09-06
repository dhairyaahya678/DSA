class Solution {
    boolean isPalindrome(String s) {
        // code here
        
        int j = s.length()-1;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            j--;
        }
        return true;
    }
}
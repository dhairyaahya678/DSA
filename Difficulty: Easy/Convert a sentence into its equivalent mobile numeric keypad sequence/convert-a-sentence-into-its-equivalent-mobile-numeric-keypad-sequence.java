//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0){
            String S = read.readLine();
            Solution obj = new Solution();
            System.out.println(obj.printSequence(S));
            
        }
    } 
} 
// } Driver Code Ends


//User function Template for Java
class Solution 
{ 
    String printSequence(String S) 
    { 
        StringBuilder sb = new StringBuilder();
        
        for(char c : S.toCharArray()) {
            if(c == ' ') {
                sb.append("0");
            } else if(c == 'A' || c == 'a') {
                sb.append("2");
            } else if(c == 'B' || c == 'b') {
                sb.append("22");
            } else if(c == 'C' || c == 'c') {
                sb.append("222");
            } else if(c == 'D' || c == 'd') {
                sb.append("3");
            } else if(c == 'E' || c == 'e') {
                sb.append("33");
            } else if(c == 'F' || c == 'f') {
                sb.append("333");
            } else if(c == 'G' || c == 'g') {
                sb.append("4");
            } else if(c == 'H' || c == 'h') {
                sb.append("44");
            } else if(c == 'I' || c == 'i') {
                sb.append("444");
            } else if(c == 'J' || c == 'j') {
                sb.append("5");
            } else if(c == 'K' || c == 'k') {
                sb.append("55");
            } else if(c == 'L' || c == 'l') {
                sb.append("555");
            } else if(c == 'M' || c == 'm') {
                sb.append("6");
            } else if(c == 'N' || c == 'n') {
                sb.append("66");
            } else if(c == 'O' || c == 'o') {
                sb.append("666");
            } else if(c == 'P' || c == 'p') {
                sb.append("7");
            } else if(c == 'Q' || c == 'q') {
                sb.append("77");
            } else if(c == 'R' || c == 'r') {
                sb.append("777");
            } else if(c == 'S' || c == 's') {
                sb.append("7777");
            } else if(c == 'T' || c == 't') {
                sb.append("8");
            } else if(c == 'U' || c == 'u') {
                sb.append("88");
            } else if(c == 'V' || c == 'v') {
                sb.append("888");
            } else if(c == 'W' || c == 'w') {
                sb.append("9");
            } else if(c == 'X' || c == 'x') {
                sb.append("99");
            } else if(c == 'Y' || c == 'y') {
                sb.append("999");
            } else if(c == 'Z' || c == 'z') {
                sb.append("9999");
            }
        }
        
        return sb.toString();
    }
}

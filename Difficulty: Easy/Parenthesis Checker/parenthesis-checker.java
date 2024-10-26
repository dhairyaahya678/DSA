//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class Driverclass {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Reading total number of testcases
        int t = sc.nextInt();

        while (t-- > 0) {
            // reading the string
            String st = sc.next();

            // calling ispar method of Paranthesis class
            // and printing "balanced" if it returns true
            // else printing "not balanced"
            if (new Solution().ispar(st) == true)
                System.out.println("true");
            else
                System.out.println("false");
        }
    }
}
// } Driver Code Ends



class Solution
{
    //Function to check if brackets are balanced or not.
    static boolean ispar(String x)
    {
        // add your code here
        Stack<Character> s = new Stack<>();
        for(char ch : x.toCharArray()) {

//pushing all the opening brackets into stack
            if(ch == '(' || ch == '{' || ch == '[') {
                s.push(ch);
            }
            else {

//removing and at the same time checking whether the closing bracket is equal to the opening bracket.
                if(ch == ')') {
                    if(s.isEmpty() || s.pop() != '('){
                        return false;
                    }
                }
                if(ch == '}') {
                    if(s.isEmpty() || s.pop() != '{'){
                        return false;
                    }
                }
                if(ch == ']') {
                    if(s.isEmpty() || s.pop() != '['){
                        return false;
                    }
                }
            }
            
            
        }

// if the stack is empty, return true which means that all the brackets are balanced. 
        return s.isEmpty();
    }
}
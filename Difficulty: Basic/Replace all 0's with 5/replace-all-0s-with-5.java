//{ Driver Code Starts
import java.util.*;
class Replace{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	while(t-->0){
		int n=sc.nextInt();
		Solution g=new Solution();
		System.out.println(g.convertFive(n));
	
System.out.println("~");
}
}
}
// } Driver Code Ends


/*Complete the function below*/
class Solution{
	public static int convertFive(int n){
    //add code here.
        String s = Integer.toString(n);
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0'){
                sb.append('5');
            }
            else{
                sb.append(s.charAt(i));
            }
        }
        int ans = Integer.parseInt(sb.toString());
        return ans;
    }
}
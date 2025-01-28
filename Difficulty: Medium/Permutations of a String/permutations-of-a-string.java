//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            String S = br.readLine().trim();
            Solution obj = new Solution();
            ArrayList<String> ans = obj.findPermutation(S);
            Collections.sort(ans);
            for (int i = 0; i < ans.size(); i++) {
                out.print(ans.get(i) + " ");
            }
            out.println();

            out.println("~");
        }
        out.close();
    }
}

// } Driver Code Ends


class Solution {
    public ArrayList<String> findPermutation(String s) {
        // Code here
        TreeSet<String> resultSet = new TreeSet<>();
        permute(s.toCharArray(), 0, resultSet);
        return new ArrayList<>(resultSet);
        
    }

    private static void permute(char[] chars, int index, TreeSet<String> resultSet) {
        if (index == chars.length) {
            resultSet.add(new String(chars));
            return;
        }

        for (int i = index; i < chars.length; i++) {
            swap(chars, i, index);
            permute(chars, index + 1, resultSet);
            swap(chars, i, index); // backtrack
        }
    }

    private static void swap(char[] chars, int i, int j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }
}
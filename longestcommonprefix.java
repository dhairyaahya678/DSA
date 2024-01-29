public class longestcommonprefix {
    public String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];
        for (String word : strs) {
            while (word.indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }
            if (prefix.equals(""))
                return "";
        }
        return prefix;
    }

    public static void main(String[] args) {
        longestcommonprefix solution = new longestcommonprefix();

        // Example usage:
        String[] words1 = { "flower", "flow", "flight" };
        System.out.println("Longest common prefix: " + solution.longestCommonPrefix(words1));

        String[] words2 = { "dog", "racecar", "car" };
        System.out.println("Longest common prefix: " + solution.longestCommonPrefix(words2));
    }
}
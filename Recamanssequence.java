
class Solution {
    static ArrayList<Integer> recamanSequence(int n) {
        
        ArrayList<Integer> sequence = new ArrayList<>(n);
        
        int prev = 0;

        sequence.add(prev);

        for (int i = 1; i < n; i++) {
            int next = prev - i;
            if (next >= 0 && !sequence.contains(next)) {
                sequence.add(next);
            } else {
                next = prev + i;
                sequence.add(next);
            }
            prev = next;
        }

        return sequence;
    }
}


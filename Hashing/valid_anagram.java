package Hashing;

class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false; // quick length check

        Map<Character, Integer> hmm = new HashMap<>();

        // count frequencies from s
        for (char ch : s.toCharArray()) {
            hmm.put(ch, hmm.getOrDefault(ch, 0) + 1);
        }

        // reduce frequencies using t
        for (char ch : t.toCharArray()) {
            if (!hmm.containsKey(ch) || hmm.get(ch) == 0) {
                return false; // extra char or overuse
            }
            hmm.put(ch, hmm.get(ch) - 1);
        }

        // final check: all counts must be zero
        for (int val : hmm.values()) {
            if (val != 0) return false;
        }

        return true;
    }
}

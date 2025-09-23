package Hashing;

class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;

        HashMap<Character, Character> map = new HashMap<>();
        HashSet<Character> used = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            char b = t.charAt(i);

            if (map.containsKey(a)) {
                if (map.get(a) != b) return false; // existing mapping mismatch
            } else {
                if (used.contains(b)) return false; // b already mapped by some other a
                map.put(a, b);
                used.add(b);
            }
        }

        return true;
    }
}

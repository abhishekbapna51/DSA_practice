package Hashing;

class Solution {
    public int firstUniqChar(String s) {
        int n = s.length();
        HashMap<Character, Integer> hmm = new HashMap<>();
        for(char ch : s.toCharArray()){
            hmm.put(ch, hmm.getOrDefault(ch, 0) + 1);
        }
        for(int i = 0; i < n; i++){
            if(hmm.get(s.charAt(i)) == 1){
                return i;
            }
        }
        return -1;
    }
}
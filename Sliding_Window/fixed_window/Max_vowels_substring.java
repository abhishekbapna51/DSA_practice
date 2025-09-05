class Solution {
    public int maxVowels(String s, int k) {
        int n = s.length();
        int sum = 0;
        int best = 0;
        for(int i = 0; i < n; i++){
            if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u'){
                sum++;
            }

            if(i >= k && (s.charAt(i-k) == 'a' || s.charAt(i-k) == 'e' || s.charAt(i-k) == 'i' || s.charAt(i-k) == 'o' || s.charAt(i-k) == 'u')) sum--;
            if ( i >= k - 1) best = Math.max(best, sum);
        }
        return best;
    }
}
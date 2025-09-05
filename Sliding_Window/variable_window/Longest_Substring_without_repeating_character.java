import java.util.*;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        HashSet<Character> set = new HashSet<>();
        int left = 0, right = 0, maxlength = 0;

        while(right < n){
                if(!set.contains(s.charAt(right))){
                    set.add(s.charAt(right));
                    maxlength = Math.max(maxlength, right - left + 1);
                    right++;
                }
                else {
                    set.remove(s.charAt(left));
                    left++;
                }
        }
        return maxlength;
    }
}
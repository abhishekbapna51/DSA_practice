class Solution {
    public int longestOnes(int[] nums, int k) {
        int n = nums.length;
        int l = 0, best = 0, zerocount = 0;

        for(int r = 0; r < n; r++){
            if (nums[r] == 0) zerocount++;
            while(zerocount > k){
                if(nums[l] == 0) zerocount--;
                l++;
            }
            best = Math.max(best, r - l + 1);
        }
        return best;
    }
}
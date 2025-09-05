class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        int sum = 0;
        int best = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            sum = sum + nums[i];
            if (i >= k) sum = sum - nums[i - k];
            if (i >= k - 1) best = Math.max(best, sum);
        }
        return best*1.0/k;
    }
}
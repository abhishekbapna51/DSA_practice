class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        // Code here
        int n = arr.length;
        int sum = 0;
        int best = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            sum += arr[i];
            if(i >= k) sum -= arr[i - k];
            if(i >= k - 1) best = Math.max(best, sum);
        }
        return best;
    }
}
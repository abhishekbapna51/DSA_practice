class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int l = 0;
        int maxlen = Integer.MAX_VALUE;
        int sum = 0;
        // int sum2 = 0;
        // for(int i = 0; i < n; i++){
        //     sum2 += nums[i];
        // }
        // if(sum2 < target) maxlen = 0;
        for(int r = 0; r < n; r++){
            sum += nums[r];

            while(sum >= target){
                
                maxlen = Math.min(maxlen, r - l + 1);
                sum -= nums[l];
                l++;
            }
            
        }

        return maxlen == Integer.MAX_VALUE ? 0 : maxlen;
    }
}
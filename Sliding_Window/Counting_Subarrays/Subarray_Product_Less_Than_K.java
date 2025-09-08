class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k <= 1) return 0;
        int l = 0, res = 0;
        long product = 1L;

        for(int r = 0; r < nums.length; r++){
            product *= nums[r];
            while(product >= k){
                product /= nums[l];
                l++;
            }
            res += (r - l + 1);
        }
        return res;
    }
}
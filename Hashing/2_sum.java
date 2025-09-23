class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        HashMap<Integer, Integer> hmm = new HashMap<>();
        for(int i = 0; i < n; i++){
            int num = target - nums[i];
            if(hmm.containsKey(num)){
                return new int[]{hmm.get(num), i};
            }
            hmm.put(nums[i], i);
        }
        return new int[]{-1, -1};
    }
}
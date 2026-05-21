class Solution {
    public int rob(int[] nums) {

        int next1 = 0;
        int next2 = 0;

        for(int i = nums.length-1; i>=0; i--){
            int take = nums[i]+next2;
            int skip = next1;

            int curr = Math.max(take, skip);

            next2 = next1;
            next1 = curr;
        }
        return next1;
        
    }
}
class Solution {
    public int rob(int[] nums) {

        int n = nums.length;

        if(n == 1) return nums[0];

        int case1 = straightRob(0, n-1, nums);
        int case2 = straightRob(1, n, nums);

        int rob = Math.max(case1, case2);
        return rob;

    }

    public int straightRob(int start, int end, int[] nums){
        
        int next1 = 0;
        int next2 = 0;

        for(int i = start; i <end; i++){
            int take = nums[i]+next2;
            int skip = next1;

            int curr = Math.max(take, skip);

            next2 = next1;
            next1 = curr;
        }
        return next1;
        
    }
}
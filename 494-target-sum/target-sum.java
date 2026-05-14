class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        return solve(nums, target, 0, 0);
    }

    public int solve(int[] nums, int target, int index, int sum){
        if(index == nums.length){
            if(sum == target){
                return 1;
            }
            return 0;
        }

        int plus = solve(nums, target, index+1, sum+nums[index]);

        int minus = solve(nums, target, index+1, sum-nums[index]);

        return plus+minus;
    }
}
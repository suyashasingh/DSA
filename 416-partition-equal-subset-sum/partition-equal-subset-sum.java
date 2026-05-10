class Solution {

    Boolean[][] dp;

    public boolean canPartition(int[] nums) {

        int sum = 0;

        for (int num : nums) {
            sum += num;
        }

        if (sum % 2 != 0) {
            return false;
        }

        int target = sum / 2;

        dp = new Boolean[nums.length][target + 1];

        return dfs(0, target, nums);
    }

    public boolean dfs(int index,
                       int target,
                       int[] nums) {

        if (target == 0) {
            return true;
        }

        if (target < 0 ||
            index == nums.length) {

            return false;
        }

        if (dp[index][target] != null) {
            return dp[index][target];
        }

        boolean take =
            dfs(index + 1,
                target - nums[index],
                nums);

        boolean skip =
            dfs(index + 1,
                target,
                nums);

        dp[index][target] = take || skip;

        return dp[index][target];
    }
}
class Solution {

    Map<String, Integer> memo = new HashMap<>();
    public int findTargetSumWays(int[] nums, int target) {

        return dfs(nums, 0, 0, target);
        
    }

    public int dfs(int[] nums, int index, int sum, int target){
        if(index == nums.length){
            if(sum == target){
                return 1;
            }
            else{
                return 0;
            }
        }

        String key = index + "," + sum;

        if(memo.containsKey(key)){
            return memo.get(key);
        }

        int add = dfs(nums, index+1, sum+nums[index], target);
        int substract = dfs(nums, index+1, sum-nums[index], target);

        int ways = add+substract;

        memo.put(key, ways);
        return ways;
    }
}
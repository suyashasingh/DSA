class Solution {
    Map<String, Integer> memo = new HashMap<>();
    public int change(int amount, int[] coins) {
        return dfs(0, amount, coins);
        
    }

    public int dfs(int index, int amount, int[] coins){
        if(amount == 0) return 1;
        if(amount<0) return 0;
        if(index == coins.length) return 0;

        String key = index+ "," +amount;

        if(memo.containsKey(key)){
            return memo.get(key);
        }

        int take = dfs(index, amount-coins[index], coins);
        int skip = dfs(index+1, amount, coins);

        int ways = take+skip;
        memo.put(key, ways);

        return ways;
    }
}

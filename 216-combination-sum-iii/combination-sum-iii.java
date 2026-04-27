class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {

        List<List<Integer>> result = new ArrayList<>();

        backtrack(1, k, n, new ArrayList<>(), result);
        return result;
    }

    public void backtrack(int index, int k, int target, List<Integer> curr, List<List<Integer>> result){
        if(k == 0 && target == 0){
            result.add(new ArrayList<>(curr));
            return;
        }

        if(k == 0 || target<0){
            return;
        }

        for(int i = index; i <= 9; i++){
            if(i>target) break;

            curr.add(i);
            backtrack(i+1, k-1, target-i, curr, result);
            curr.remove(curr.size()-1);
        }
    }
}

//“Time complexity is exponential because we try different combinations of numbers from 1 to 9. Space complexity is O(k) due to recursion depth.”
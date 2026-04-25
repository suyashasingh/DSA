class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {

       List<List<Integer>> result = new ArrayList<>();
        backTrack(0, candidates, target, new ArrayList<>(), result);
        return result;
        
    }

    public void backTrack(int index, int[] candidates, int target, List<Integer> curr, List<List<Integer>> result ){
        if(target == 0){
            result.add(new ArrayList<>(curr));
            return;
        }

        if(target<0 || index == candidates.length){
            return;
        }

        curr.add(candidates[index]);
        backTrack(index, candidates, target-candidates[index], curr, result);

        curr.remove(curr.size()-1);

        backTrack(index+1, candidates, target, curr, result);
    }
}
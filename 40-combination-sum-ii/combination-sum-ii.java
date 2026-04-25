class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {

       List<List<Integer>> result = new ArrayList<>();
       Arrays.sort(candidates);
       backTrack(0, candidates, target, new ArrayList<>(), result);
       return result;
        
    }

    public void backTrack(int index, int[] candidates, int target, List<Integer> curr, List<List<Integer>> result ){
        if(target == 0){
            result.add(new ArrayList<>(curr));
            return;
        }

       for(int i = index; i<candidates.length; i++){
        if(i>index && candidates[i] == candidates[i-1]) continue;

        if(candidates[i]>target) break;

        curr.add(candidates[i]);
        backTrack(i+1, candidates, target-candidates[i], curr, result);
        curr.remove(curr.size()-1);
       }
    }
}
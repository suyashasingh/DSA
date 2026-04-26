class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        backtrack(0, nums, new ArrayList<>(), result);
        return result;        
    }

    public void backtrack(int index, int[] nums, List<Integer> curr, List<List<Integer>> result){
       
        result.add(new ArrayList<>(curr));

        for(int i = index; i<nums.length; i++){
            if(i>index && nums[i] == nums[i-1]) continue;
            curr.add(nums[i]);

            backtrack(i+1, nums, curr, result);
            curr.remove(curr.size()-1);
        }
    }
}

//tc- O(n*2power n) same for space
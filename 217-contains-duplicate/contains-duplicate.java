class Solution {
    public boolean containsDuplicate(int[] nums) {

        Map<Integer, Integer> hs = new HashMap<>();

        for(int num : nums){
            hs.put(num, hs.getOrDefault(num, 0)+1);
            if(hs.get(num)>1) return true;
        }
        return false;

        

        
    }
}
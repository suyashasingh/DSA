class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        int farther = 0;
        for(int i = 0; i<n; i++){
            if(i>farther){
                return false;
            }
            farther = Math.max(farther, nums[i]+i);

            if(farther>=n-1){
                return true;
            }
        }
        return false;
        
    }
}
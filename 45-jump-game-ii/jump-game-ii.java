class Solution {
    public int jump(int[] nums) {
        int n = nums.length;
        int jump = 0;
        int currIndex = 0;
        int farther = 0;
        for(int i = 0; i<n-1; i++){

            farther = Math.max(farther, nums[i]+i);

            if(i==currIndex){
                jump++;
                currIndex = farther;
            }
        }
        return jump;
    }
}
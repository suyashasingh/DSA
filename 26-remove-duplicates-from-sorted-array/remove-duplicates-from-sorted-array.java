class Solution {
    public int removeDuplicates(int[] nums) {
        int j=1;
        for(int k = 1;k<nums.length; k++){

            if(nums[k] != nums[k-1]){
                nums[j]=nums[k];
                j++;
            }
        }
        return j;
        
    }
}
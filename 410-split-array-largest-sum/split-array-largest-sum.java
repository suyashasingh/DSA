class Solution {
    public int splitArray(int[] nums, int k) {
        if(k>nums.length) return -1;
        int s = 0;
        int ans = -1;
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        int e=sum;

        while(s<=e){
            int mid = s+(e-s)/2;

            if(isPossible(mid, nums, k)){
                ans = mid;
                e = mid-1;
            }
            else{
                s = mid+1;
            }
        }
        return ans;
        
    }

    public boolean isPossible(int mid, int[] nums, int k){
        int subArr = 1;
        int arrSum = 0;

        for(int i = 0; i< nums.length; i++){
            if(arrSum+nums[i]<=mid){
                arrSum += nums[i];
            }
            else{
                subArr++;
                if(subArr>k || nums[i]>mid){
                    return false;
                }
                arrSum = nums[i];
            }
        }
        return true;
    }
}
class Solution {
    public int findPeakElement(int[] nums) {
        int n = nums.length;
        int low = 0;
        int high = n-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(nums.length==1)return 0;
            if(mid==0){
                if(nums[mid]>nums[mid+1]) return mid;
                else{
                    low=mid+1;
                }
            }
            else if(mid==n-1){
                if(nums[mid]>nums[mid-1]) return mid;
                else high=mid-1;
            }
            else{
                if(nums[mid]>nums[mid-1]&&nums[mid]>nums[mid+1]){
                    return mid;
                }
                else if(nums[mid]<nums[mid+1]){
                    low = mid+1;
                }
                else{
                    high=mid-1;
                }
            }
        }
        return -1;
        
    }
}
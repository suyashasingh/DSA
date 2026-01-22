class Solution {
    public int[] searchRange(int[] nums, int target) {

        int first = firstIndex(nums,target);
        int last = lastIndex(nums,target);
        return new int[]{first,last};
        
    }

    private int firstIndex(int[] nums, int x){
        int n = nums.length;
        int low = 0;
        int high = n-1;
        int ans = -1;

         while (low <= high) {
            int mid = low + (high - low) / 2;

            if(nums[mid]==x){
                ans = mid;
                high = mid-1; //move left
            }
            else if (nums[mid]<=x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

     private int lastIndex(int[] nums, int x){
        int n = nums.length;
        int low = 0;
        int high = n-1;
        int ans = -1;

         while (low <= high) {
            int mid = low + (high - low) / 2;

            if(nums[mid]==x){
                ans = mid;
                low = mid+1; //move right
            }
            else if (nums[mid]<=x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }
}
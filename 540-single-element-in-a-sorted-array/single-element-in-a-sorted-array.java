class Solution {
    public int singleNonDuplicate(int[] nums) {

        int n = nums.length;
        int low = 0;
        int high = n - 1;

        if (n == 1) return nums[0];

        while (low < high) {
            int mid = low + (high - low) / 2;

            // make sure mid is even
            if (mid % 2 == 1) mid--;

            if (nums[mid] == nums[mid + 1]) {
                low = mid + 2;
            } else {
                high = mid;
            }
        }
        return nums[low];
    }
}

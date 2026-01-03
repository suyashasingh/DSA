class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        if (n <= 1) return;

        int idx1 = -1;

        // Step 1: find break point
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                idx1 = i;
                break;
            }
        }

        // Step 2: if no breakpoint, reverse whole array
        if (idx1 == -1) {
            reverse(nums, 0, n - 1);
            return;
        }

        // Step 3: find element just greater than nums[idx1]
        for (int i = n - 1; i > idx1; i--) {
            if (nums[i] > nums[idx1]) {
                swap(nums, i, idx1);
                break;
            }
        }

        // Step 4: reverse the right half
        reverse(nums, idx1 + 1, n - 1);
    }

    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }
}

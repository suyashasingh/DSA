class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        
        // int n = nums.length;
        // int count = 0;
        // for(int i = 0 ;i <n ;i++){
        //     int sum = 0;
        //     for(int j = i; j<n ; j++){
        //         sum+=nums[j];
        //         if(sum==goal){
        //             count++;
        //         }
        //     }
        // }
        // return count;
        // using two pointers
        return atMost(nums, goal) - atMost(nums, goal-1);
    }

    public int atMost(int[] nums, int goal){
        if (goal < 0) {
            return 0;
        }
        int n = nums.length;
        int left = 0;
        int sum = 0;
        int count = 0;

        for(int right = 0; right< n; right++){
            sum+=nums[right];

            while(sum>goal){
                sum-=nums[left];
                left++;
            }
            count += right-left+1;
        }
        return count;
    }
}
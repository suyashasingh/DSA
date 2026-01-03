class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int ans = 0;
        // for(int i = 0; i<nums.length; i++){
        //     set.add(nums[i]);
        // }
        // if (nums.length == 0) return 0;
        // for(int i = 0; i<nums.length; i++){
        //    if(set.contains(nums[i]-1)) continue;
        //    else{
        //     int count = 0;
        //     int current = nums[i];
        //     while(set.contains(current)){
        //         count++;
        //         current++;
        //         ans = Math.max(ans, count);
        //     }
        //    }
        // }
        // return ans;
       

       for(int num : nums){
        set.add(num);
       }

       if(nums.length==0) return 0;

       for(int num : set){
            if(!set.contains(num - 1)){
                int current = num;
                int count = 0;
                while(set.contains(current)){
                    current++;
                    count++;
                    ans = Math.max(ans, count);
                }
            }
        }
        return ans;
    }
}
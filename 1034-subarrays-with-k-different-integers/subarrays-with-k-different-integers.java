class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return atMost(nums, k) - atMost(nums, k-1);
    }

    public int atMost(int[] nums, int k){

        int left = 0;
        int count = 0;

        Map<Integer, Integer> mp = new HashMap<>();

        for(int right = 0; right<nums.length; right++){
            mp.put(nums[right], mp.getOrDefault(nums[right], 0)+1);
            while(mp.size()>k){
                mp.put(nums[left], mp.get(nums[left])-1);
                if(mp.get(nums[left])==0){
                    mp.remove(nums[left]);
                }
                left++;
            }

            count+=(right-left)+1;
        }
        return count;
    }

}

//TC- O(n)
//SC- O(n)
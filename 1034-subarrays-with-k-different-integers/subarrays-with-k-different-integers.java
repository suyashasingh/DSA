class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {

        return atMost(nums, k) - atMost(nums, k-1);
    }

    public int atMost(int[] nums, int k){
        if(k == 0){
            return 0;
        }
        int n = nums.length;
        int left = 0;
        int dis = 0;
        HashMap<Integer, Integer> freq = new HashMap<>();

        for(int right = 0; right<n; right++){
            freq.put(nums[right], freq.getOrDefault(nums[right], 0)+1);

            while(freq.size()>k){
                freq.put(nums[left], freq.get(nums[left])-1);
                if(freq.get(nums[left])==0){
                    freq.remove(nums[left]);
                }
                left++;
            }

            dis += right-left+1;
        }
        return dis;
        
    }
}
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        // Set<List<Integer>> set = new HashSet<>();

        // for(int i = 0; i<n ;i++){
        //     for(int j = i+1; j<n ; j++){
        //         for(int k = j+1; k<n ; k++){
        //             if(nums[i] + nums[j] + nums[k] == 0){
        //                 List <Integer> trp = Arrays.asList(
        //                     nums[i], nums[j], nums[k]
        //                 );
        //                 Collections.sort(trp);
        //                 set.add(trp);
        //             }
        //         }
        //     }
        // }
        // return new ArrayList<>(set);
        Arrays.sort(nums);

        List<List<Integer>> ls = new ArrayList<>();

        for(int i = 0 ;i<n-2;i++){
            if(i>0 && nums[i] == nums[i-1]) continue;
            if(nums[i]>0) break;

            int left = i+1;
            int right = n-1;

            while(left<right){
                int sum = nums[i] + nums[left] + nums[right];
                if(sum==0){
                    ls.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    while (left < right && nums[left] == nums[left + 1]) left++;
                    while (left < right && nums[right] == nums[right - 1]) right--;
                left++;
                right--;
                }
                else if(sum<0){
                    left++;
                }
                else{
                    right--;
                }
            }
        
        }
        return ls;
        
    }
}
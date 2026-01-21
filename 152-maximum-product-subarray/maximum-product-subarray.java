class Solution {
    public int maxProduct(int[] nums) {

        // //IN 2 pass optimized but DP version preffered
        // int ans = Integer.MIN_VALUE;
        // int max = 1;

        // for(int i = 0; i<nums.length; i++){
        //     max*=nums[i];
        //     ans = Math.max(max, ans);
        //     if(max == 0){
        //         max = 1;
        //     }
        // }
        // max = 1;
        // for(int i = nums.length-1;i>=0;i--){
        //     max*=nums[i];
        //     ans = Math.max(max, ans);
        //     if(max==0){
        //         max=1;
        //     }
        // }
        // return ans;

        //DP version in Single Pass

        int maxProduct = nums[0];
        int minProduct = nums[0];
        int ans = nums[0];

        for(int i = 1; i<nums.length;i++){
            int curr = nums[i];
            if(curr<0){
                int temp = maxProduct;
                maxProduct = minProduct;
                minProduct = temp;
            }

            maxProduct = Math.max(curr, curr*maxProduct);
            minProduct = Math.min(curr, curr*minProduct);
            ans = Math.max(ans, maxProduct);
        }
        return ans;
    }
}
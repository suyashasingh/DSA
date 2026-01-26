class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int n = nums.length;
        int low = 1;
        int high = 0;
        for(int num : nums){
            high = Math.max(high, num);
        }

        while(low<=high){
            int mid = low+(high-low)/2;
            long totaldiv = calculate(nums, mid);
            if(totaldiv<=threshold){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return low;
        
    }

    private long calculate(int[] nums, int divisor){
        long total = 0;
        for(int i = 0; i<nums.length; i++){
            total+=(long)Math.ceil((double)nums[i]/divisor);
        } 
        return total;
    }
}
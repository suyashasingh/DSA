class Solution {
    public int majorityElement(int[] nums) {
        // Map<Integer, Integer> ms = new HashMap<>();
        // int n = nums.length;
        // for( int num : nums){
        //     ms.put(num, ms.getOrDefault(num, 0) + 1);
        //     if(ms.get(num)>n/2){
        //       return num;
        //     }
        // }
        // return -1;

        //optimal approach
        int count = 0;
        int candidate = 0;
        for(int num : nums){
            if(count == 0){
                candidate = num;
            }
            if(candidate == num){
                count++;
            }
            else{
                count--;
            }
        }
        return candidate;
 
    }
}
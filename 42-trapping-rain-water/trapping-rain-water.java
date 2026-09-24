class Solution {
    public int trap(int[] height) {

        //brute force

        // int n = height.length;
        // int total = 0;
        // for(int i = 0 ; i<n ; i++){
        //     int leftMax = 0;

        //     for(int j = 0; j<i; j++){
        //         leftMax = Math.max(leftMax, height[j]);
        //     }

        //     int rightMax = 0;
        //     for(int j = i+1; j<n ; j++){
        //         rightMax = Math.max(rightMax, height[j]);
        //     }

        //     int water = Math.min(rightMax, leftMax) - height[i];

        //     if(water>0){
        //         total+=water;
        //     }
        // }
        // return total;


        //optimal

        int left = 0;
        int right = height.length-1;

        int leftMax = 0;
        int rightMax = 0;
        int total = 0;

        while(left<right){
            if(height[left]<=height[right]){
                if(height[left]>=leftMax){
                    leftMax = height[left];
                }
                else{
                    total += leftMax - height[left];
                }
                left++;
            }
            else{

                if(height[right]>=rightMax){
                    rightMax = height[right];
                }
                else{
                    total += rightMax - height[right];
                }
                right--;

            }

        }

        return total;
    
    }
}
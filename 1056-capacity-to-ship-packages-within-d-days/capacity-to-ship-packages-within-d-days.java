class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low = 0;
        int high = 0;

        for(int w : weights){
            low = Math.max(low, w);
            high += w;
        }

        while(low<=high){
            int mid = low+(high-low)/2;
            int reqDays = totalDays(weights, mid);

            if(reqDays<=days){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return low;  
    }

    private int totalDays(int[] weights, int capacity){
        int load = 0;
        int Ddays = 1;
        for(int w : weights){
            if(load+w > capacity){
                Ddays++;
                load = w;
            }
            else{
                load+=w;
            }
        }
        return Ddays;
    }
}
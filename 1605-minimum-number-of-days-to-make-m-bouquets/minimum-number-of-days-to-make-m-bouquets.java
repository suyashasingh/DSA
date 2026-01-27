class Solution {
    public int minDays(int[] bloomDay, int m, int k) {

        int n = bloomDay.length;
        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;

        if ((long) m * k > n) return -1;

        for(int bloom : bloomDay){
            low = Math.min(low, bloom);
            high = Math.max(high, bloom);
        }

        while(low<=high){
            int mid = low+(high-low)/2;

            boolean totalBq = canMakeBouquets(bloomDay, m , k , mid);
            if(totalBq){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return low;   
    }

    private boolean canMakeBouquets(int[] bloomDay, int m, int k, int day){
        int flowers = 0;
        int bouquets = 0;

        for(int i = 0; i<bloomDay.length; i++){
            if(bloomDay[i]<=day){
                flowers++;
                if(flowers==k){
                    bouquets++;
                    flowers = 0;
                }
            }
            else{
                flowers = 0;
            }
        }
        return bouquets>=m;
    }
}
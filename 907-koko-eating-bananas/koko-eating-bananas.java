class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        int n = piles.length;
        int low = 1;
        int high = 0;

        for(int pile : piles){
            high = Math.max(high , pile);
        }

        while(low<=high){
            int mid = low+(high-low)/2;
            long total = caclulate(piles,mid);
            if(total<=h){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return low;

        
    }

    private long caclulate(int[] piles, int speed){
        long totalh = 0;
        for(int i=0;i<piles.length;i++){
            totalh+=(long)Math.ceil((double)piles[i]/speed);
        }
        return totalh;
       
    }
}
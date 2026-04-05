class Solution {
    public double minMaxDist(int[] stations, int k) {
        double s = 0;
        double e = 0;

        // max gap find karo
        for(int i = 1; i < stations.length; i++){
            e = Math.max(e, stations[i] - stations[i-1]);
        }

        double ans = 0;

        // binary search on double
       while(e - s > 1e-6){
            double mid = (s + e) / 2;
        
            if(isPossible(mid, stations, k)){
                e = mid;
            } else {
                s = mid;
            }
        }
            return e;
    }

     public boolean isPossible(double mid, int[] stations, int k){
        int count = 0;
    
        for(int i = 1; i < stations.length; i++){
            double gap = stations[i] - stations[i-1];
    
            count += (int)Math.ceil(gap / mid) - 1;
    
            if(count > k) return false;
        }
        return true;
    }
}
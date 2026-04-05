// User function Template for Java

class Sol {
    public static int maxOnes(int Mat[][], int N, int M) {
        int max_count = 0;
        int index = -1;
        
        for(int i = 0;i<N;i++){
            int count_ones = M-lowerBound(Mat[i], M, 1);
            if(count_ones>max_count){
                max_count = count_ones;
                index = i;
            }
        }
        return index;
       
        // your code here
        
    }
    
    public static int lowerBound(int[] Mat, int N, int x){
         int s = 0;
        int e = N-1;
        int ans = N;
        
        while(s<=e){
            int mid = s+(e-s)/2;
            
            if(Mat[mid]>=x){
                ans = mid;
                e = mid-1;
            }
            else{
                s = mid+1;
            }
        }
        return ans;
    }
}
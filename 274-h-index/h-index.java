class Solution {
    public int hIndex(int[] citations) {
        // for h index we will check the h citations, if h = 1 citations should be atleast h.

        int n = citations.length;
        int answer = 0;
        for(int citi_index = 1; citi_index<=n; citi_index++){
            int count = 0;

            for(int citi : citations){
                if(citi>=citi_index){
                    count++;
                }
            }

            if(count>=citi_index){
                answer = citi_index;
            }
        }
        return answer;
        
    }
}
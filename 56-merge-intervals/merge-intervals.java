class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b)-> a[0]-b[0]);
        List<int[]> result = new ArrayList<>();

        result.add(intervals[0]);

        for(int i=1 ;i<intervals.length;i++){
            int[] last = result.get(result.size()-1);
            int[] start = intervals[i];

            if(start[0]<=last[1]){
                last[1] = Math.max(last[1], start[1]);
            }
            else{
                result.add(intervals[i]);
            }
        }
        return result.toArray(new int [result.size()][]);
        
    }
}
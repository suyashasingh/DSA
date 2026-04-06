class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;

        int s = 0;
        int e = m-1;

        while(s<n && e>=0){
            int mid = s+(e-s)/2;
            if(matrix[s][e]==target){
                return true;
            }
            else if(matrix[s][e]>target){
                e--;
            }
            else{
                s++;
            }
        }
        return false;
        
    }
}
class Solution {
    public void setZeroes(int[][] matrix) {
        boolean firstRow = false;
        boolean firstColumn = false;
        int m = matrix.length;
        int n = matrix[0].length;

        //first Col marking
        for(int i = 0;i<m; i++){
            if(matrix[i][0]==0){
                firstColumn = true;
                break;
            }
        }

        //first Row marking
        for(int j = 0;j<n; j++){
            if(matrix[0][j]==0){
                firstRow = true;
                break;
            }
        }

        //for marking zeros
        for(int i = 1; i<m; i++){
            for(int j = 1; j<n; j++){
                if(matrix[i][j]==0){
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        //for filling zeros
        for(int i = 1; i<m ;i++){
            for(int j = 1; j<n; j++){
                if(matrix[i][0]==0 || matrix[0][j]==0){
                    matrix[i][j]=0;
                }
            }
        }

        //if dealing with col, run loop against row (m) keep changing i and keep col j 0
        for(int i = 0;i<m; i++){
            if(firstColumn){
                matrix[i][0] = 0;
            }
        }

        //if dealing with row, run loop againt column (n) keep i 0 and change column j
        for(int j = 0;j<n; j++){
            if(firstRow){
                matrix[0][j] = 0;
            }
        }
        
    }
}
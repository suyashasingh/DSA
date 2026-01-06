class Solution {
    public void rotate(int[][] matrix) {


        //bruteforce approach
        // int n = matrix.length;
        // int[][] rotate = new int[n][n];

        // for(int i = 0;i<n;i++){
        //     for(int j = 0; j<n; j++){
        //         rotate[j][n-1-i] = matrix [i][j];
        //     }
        // }

        // for(int i = 0;i<n ; i++){
        //     for(int j = 0; j<n ; j++){
        //         matrix[i][j] = rotate[i][j];
        //     }
        // }


        //Optimal approach
        //without extra space

        int n = matrix.length;

        //approach--->1. Transpose matrix , 2.reverse each row

        // transpose
        for(int i = 0;i<n;i++){
            for(int j = i+1; j<n ;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        //reverse
        for(int i = 0;i<n;i++){
            int left = 0;
            int right = n-1;
            while(left<right){
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }
        }
        
    }
}
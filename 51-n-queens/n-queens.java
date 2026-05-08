class Solution {

    List<List<String>> ans = new ArrayList<>();
    public List<List<String>> solveNQueens(int n) {
        char[][] board = new char[n][n];

        for(int i = 0; i<n ; i++){
            Arrays.fill(board[i], '.');
        }

        solve(0, board, n);
        return ans;
    }

    public void solve(int row, char[][] board, int n){
        if(row==n){
            List<String> temp = new ArrayList<>();

            for(char[] arr : board){
                temp.add(new String(arr));
            }

            ans.add(temp);
            return;
        }
        for(int col = 0; col<n ; col++){
            if(isSafe(row, col, board, n)){
                board[row][col] = 'Q';

                solve(row+1, board, n);

                board[row][col] = '.';
            }
        }
    }

    public boolean isSafe(int row, int col, char[][] board, int n){

        //column

        for(int i = 0; i<row;i++){
            if(board[i][col] == 'Q'){
                return false;
            }
        }

        //upper diagonal

        int i = row-1;
        int j = col-1;

        while(i>=0 && j>=0){
            if(board[i][j]=='Q'){
                return false;
            }

            i--;
            j--;
        }

        //upper right diagonal

        i = row-1;
        j = col+1;

        while(i>=0 && j<n){
            if(board[i][j]=='Q'){
                return false;
            }

            i--;
            j++;
        }

        return true;
    }

}
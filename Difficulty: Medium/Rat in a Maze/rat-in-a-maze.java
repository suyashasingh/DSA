class Solution {
    
    ArrayList<String> result = new ArrayList<>();
    public ArrayList<String> ratInMaze(int[][] maze) {
        
        int n = maze.length;

        if(maze[0][0]==0){
            return result;
        }
        
        boolean[][] visited = new boolean[n][n];
        
        solve(maze, n, 0, 0, "", visited);
        return result;
    }
    
    public void solve(int[][]maze, int n, int row, int col, String path, boolean[][] visited){
        if(row == n-1 && col == n-1){
            result.add(path);
            return;
        }
        
        visited[row][col] = true;
        
        //------->Down
        
        if(isSafe(maze, n, row+1, col, visited)){
            solve(maze, n, row+1, col, path+"D", visited);
        }
        
        //------->Left
        
        if(isSafe(maze, n, row, col-1, visited)){
            solve(maze, n, row, col-1, path+"L", visited);
        }
        
          
        //------->right
        
        if(isSafe(maze, n, row, col+1, visited)){
            solve(maze, n, row, col+1, path+"R", visited);
        }
        
        
        //------->UP
        
        if(isSafe(maze, n, row-1, col, visited)){
            solve(maze, n, row-1, col, path+"U", visited);
        }
        
        visited[row][col] = false;
    }
    
    public boolean isSafe(int[][] maze, int n , int row, int col, boolean[][] visited){
        if(row>=0 && col>=0 && row<=n-1 && col<=n-1 && maze[row][col]==1 && !visited[row][col]){
            return true;
        }
        return false;
    }
}
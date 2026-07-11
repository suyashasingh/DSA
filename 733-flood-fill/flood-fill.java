class Solution {
    int[] dr = {-1, 1, 0, 0};
    int[] dc = {0, 0, -1, 1};
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {

        int originalColor = image[sr][sc];

        if(originalColor == color) return image;
        dfs(image, sr, sc, color, originalColor);
        return image;
        
    }

    public void dfs(int[][] image, int row, int col, int newColor, int originalColor){
        if(row<0 || row>=image.length || col<0 || col>=image[0].length) return;
        if(image[row][col] != originalColor) return;

        image[row][col] = newColor;

        for(int d =0 ;d<4; d++){
          int newRow = row + dr[d];
          int newCol = col + dc[d];

          dfs(image, newRow, newCol, newColor, originalColor);

        }

    }
}
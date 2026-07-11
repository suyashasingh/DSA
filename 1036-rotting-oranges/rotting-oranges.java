class Solution {
    public int orangesRotting(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;

        Queue<int[]> qu = new LinkedList<>();
        int fresh = 0;

        for(int r=0; r<row; r++){
            for(int c=0; c<col; c++){
                if(grid[r][c] == 2){
                    qu.offer(new int[]{r, c});
                }

                if(grid[r][c] == 1){
                    fresh++;
                }
            }
        }

        int minutes = 0;

        if(fresh == 0){
            return 0;
        }

        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};

        while(!qu.isEmpty()){
            int size = qu.size();
            for(int i = 0; i<size; i++){
                int[] current = qu.poll();

                int row1 = current[0];
                int col1 = current[1];

                for(int d = 0; d<4; d++){

                    int Newrow = row1 + dr[d];
                    int Newcol = col1 + dc[d];
                    if(Newrow>=0 && Newcol>=0 && Newrow<row && Newcol<col && grid[Newrow][Newcol] == 1){
                        grid[Newrow][Newcol] = 2;
                        fresh--;

                        qu.offer(new int[] {Newrow, Newcol});
                    }
                }
            }
            if(!qu.isEmpty()){
              minutes++;
            }
        }

        return fresh == 0 ? minutes : -1;

        
        
    }

}
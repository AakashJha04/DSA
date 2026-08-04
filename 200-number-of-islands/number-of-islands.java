class Solution {

    void bfs(char[][] grid, int[][] vis, Queue<int[]> q, int curr_row, int curr_col, int total_row,
            int total_col) {
        vis[curr_row][curr_col] = 1;
        q.offer(new int[] { curr_row, curr_col });
        int[][] directions = { { 0, 1 },
                              { 1, 0 }, 
                              { 0, -1 }, 
                              { -1, 0 } }; //4X2

        // {0, 1}, {1, 0}, {0, -1}, {-1, 0}

        while(!q.isEmpty()){
            int[] cell = q.poll();
            for(int[] dir: directions){
                int new_row = cell[0] + dir[0];
                int new_col = cell[1] + dir[1];
                if(new_row<total_row && new_row>=0 && new_col>=0 && new_col<total_col && grid[new_row][new_col]=='1' && vis[new_row][new_col]!=1){
                    vis[new_row][new_col]=1;
                    q.offer(new int[]{new_row, new_col});
                }
            }
            
        }
    }

    public int numIslands(char[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int[][] vis = new int[row][col];
        Queue<int[]> q = new LinkedList<>();
        int numberOfIsland = 0;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] == '1' && vis[i][j]==0) {
                    numberOfIsland++;
                    bfs(grid, vis, q, i, j, row, col);
                }
            }
        }

        return numberOfIsland;
    }
}

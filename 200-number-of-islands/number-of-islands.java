class Solution {
    void bfs(char[][] grid, int row, int col, int totalRow, int totalCol){
        Queue<int[]> queue = new LinkedList<>();
        grid[row][col]='0';
        queue.offer(new int[]{row, col});
        int[][] neighbours = {{0, -1}, {-1, 0}, {0, 1}, {1, 0}};

        while(!queue.isEmpty()){
            int[] currVertex = queue.poll();
            int currRow = currVertex[0];
            int currCol = currVertex[1];
            for(int[] neighbour:neighbours){
                int newRow = currRow + neighbour[0];
                int newCol = currCol + neighbour[1];
                if(newRow<totalRow && newRow>=0 && newCol<totalCol && newCol>=0 && grid[newRow][newCol]!='0'){
                    grid[newRow][newCol]='0';
                    queue.offer(new int[]{newRow, newCol});
                }
            }
        }

    }
    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int ans = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]=='1'){
                    ans++;
                    bfs(grid, i, j, n, m);
                }
            }
        }
        return ans;
    }
}
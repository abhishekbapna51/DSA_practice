package BFS-DFS;

class Solution {
    public int numIslands(char[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int count = 0;

        for(int r = 0; r < row; r++){
            for(int c = 0; c < col; c++){
                if(grid[r][c] == '1'){
                    dfs(grid, r, c);
                    count++;
                }
            }
        }
        return count;
    }

    public void dfs(char[][] grid, int r, int c){
        if(r < 0 || c < 0 || r >= grid.length || c >= grid[0].length){
            return;
        }

        if(grid[r][c] == '0' || grid[r][c] == '2'){
            return;
        }
        grid[r][c] = '2';

        dfs(grid, r+1,c);
        dfs(grid, r-1,c);
        dfs(grid, r,c-1);
        dfs(grid, r,c+1);

    }
}
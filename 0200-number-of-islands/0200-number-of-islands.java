class Solution {
    int rLength;
    int cLength;
    
    public int numIslands(char[][] grid) {
        if(grid.length == 0) return 0; 
        rLength = grid.length; 
        cLength = grid[0].length; 
        int islandCount = 0; 
            
        for(int r = 0; r < rLength; r++) {
            for(int c = 0; c < cLength; c++) {
                if(grid[r][c] == '1') {
                    dfs(grid, r, c);
                    islandCount++;
                }
            }
        }
        
        return islandCount;
    }
    
    public void dfs(char[][] grid, int r, int c) {
        if(r < 0 || c < 0 || r >= rLength || c >= cLength 
           || grid[r][c] == '0') return;
        
        grid[r][c] = '0';
        dfs(grid, r + 1, c);
        dfs(grid, r - 1, c);
        dfs(grid, r, c + 1);
        dfs(grid, r, c - 1);
    }
}
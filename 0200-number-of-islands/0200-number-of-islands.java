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
    
//     public void bfs(char[][] grid, int r, int c) {
//         grid[r][c] = '0';
//         Queue<int[]> queue = new LinkedList<>();
//         queue.add(new int[] { r , c });
        
//         while(!queue.isEmpty()) {
//             int[] current = queue.poll();
//             int row = current[0];
//             int column = current[1]; 
            
//             if(row - 1 >= 0 && grid[row - 1][column] == '1') {
//                 queue.add(new int[] { row - 1, column });
//                 grid[row - 1][column] = '0';
//             }
            
//             if(row + 1 < grid.length && grid[row + 1][column] == '1') {
//                 queue.add(new int[] { row + 1, column});
//                 grid[row + 1][column] = '0';
//             }
            
//             if(column - 1 >= 0 && grid[row][column - 1] == '1') {
//                 queue.add(new int[] { row, column - 1 });
//                 grid[row][column - 1] = '0';
//             }
            
//             if(column + 1 < grid[row].length && grid[row][column + 1] == '1') {
//                 queue.add(new int[]{ row, column + 1});
//                 grid[row][column + 1] = '0';
//             }
//         }
//     }
}
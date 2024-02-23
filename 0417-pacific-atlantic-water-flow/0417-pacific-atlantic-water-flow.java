class Solution {
    
    int rLength;
    int cLength;
    
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        rLength = heights.length;
        cLength = heights[0].length;
        
        List<List<Integer>> result = new ArrayList<>();
        boolean[][] pacific = new boolean[rLength][cLength];
        boolean[][] atlantic = new boolean[rLength][cLength];
        
        for(int i = 0; i < cLength; i++) {
            dfs(heights, pacific, 0, i, Integer.MIN_VALUE);
            dfs(heights, atlantic, rLength - 1, i, Integer.MIN_VALUE);
        }
        
        for(int i = 0; i < rLength; i++) {
            dfs(heights, pacific, i, 0, Integer.MIN_VALUE);
            dfs(heights, atlantic, i, cLength - 1, Integer.MIN_VALUE);
        }
        
        for(int i = 0; i < rLength; i++) {
            for(int j = 0; j < cLength; j++) {
                if(atlantic[i][j] && pacific[i][j]) {
                    result.add(Arrays.asList(i, j));
                }
            }
        }
        
        return result;
    }
    
    public void dfs(int[][] heights, boolean[][] ocean, int row, int col, int prev) {
        if(row < 0 || row >= rLength || col < 0 || col >= cLength || heights[row][col] < prev || ocean[row][col]) return;
        
        ocean[row][col] = true; 
        
        int[] rowOffsets = {0, 1, 0, -1};
        int[] colOffsets = {1, 0, -1, 0};
        
        for(int i = 0; i < 4; i++) {
            dfs(heights, ocean, row + rowOffsets[i], col + colOffsets[i], heights[row][col]);
        }
        
    }
}
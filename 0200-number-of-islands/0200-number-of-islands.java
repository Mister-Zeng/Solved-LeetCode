class Solution {
    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }

        int numIslands = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == '1') {
                    numIslands++;
                    bfs(grid, i, j);
                }
            }
        }

        return numIslands;
    }

    public void bfs(char[][] grid, int x, int y) {
        grid[x][y] = '0'; // mark as visited
        Queue<int[]> neighbours = new LinkedList<>();
        neighbours.add(new int[] { x, y });

        while (!neighbours.isEmpty()) {
            int[] current = neighbours.remove();
            int row = current[0];
            int col = current[1];

            if (row - 1 >= 0 && grid[row-1][col] == '1') {
                neighbours.add(new int[] { row - 1, col });
                grid[row-1][col] = '0';
            }

            if (row + 1 < grid.length && grid[row+1][col] == '1') {
                neighbours.add(new int[] { row + 1, col });
                grid[row+1][col] = '0';
            }

            if (col - 1 >= 0 && grid[row][col-1] == '1') {
                neighbours.add(new int[] { row, col - 1 });
                grid[row][col-1] = '0';
            }

            if (col + 1 < grid[0].length && grid[row][col+1] == '1') {
                neighbours.add(new int[] { row, col + 1 });
                grid[row][col+1] = '0';
            }
        }
    }
}
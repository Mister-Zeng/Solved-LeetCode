class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character> row = null;
        HashSet<Character> column = null;
        
        for(int i = 0; i < 9; i++) {
            row = new HashSet<>();
            column = new HashSet<>();
            
            for(int j = 0; j < 9; j++) {
                char r = board[i][j];
                char c = board[j][i];
                
                if(r != '.') {
                    if(row.contains(r)) {
                        return false;
                    } else {
                        row.add(r);
                    }
                }
                
                if(c != '.') {
                    if(column.contains(c)) {
                        return false;
                    } else {
                        column.add(c);
                    }
                }
            }
        }
            
        for (int i = 0; i < 9; i = i + 3) {
            for (int j = 0; j < 9; j = j + 3) {
                if (!checkBlock(i, j, board)) {
                    return false;
                }
            }
        }
        
        return true;
    }
    
    private boolean checkBlock(int idxI, int idxJ, char[][] board) {
        HashSet<Character> blockSet = new HashSet<>();

        int rows = idxI + 3;
        int cols = idxJ + 3;

        for (int i = idxI; i < rows; i++) {
            for (int j = idxJ; j < cols; j++) {
                if (board[i][j] == '.') {
                    continue;
                }
                
                if (blockSet.contains(board[i][j])) {
                    return false;
                }

                blockSet.add(board[i][j]);
            }
        }

        return true;
    }
}
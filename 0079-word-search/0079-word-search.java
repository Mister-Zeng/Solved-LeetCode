class Solution {
    int rLength;
    int cLength;
    
    public boolean exist(char[][] board, String word) {
        rLength = board.length;
        cLength = board[0].length;
                
        for(int i = 0; i < rLength; i++) {
            for(int j = 0; j < cLength; j++) {
                if(search(board, new boolean[rLength][cLength], word, i, j, 0)) {
                    return true;
                }
            }
        }
        
        return false;
    }
    
    public boolean search(char[][] board, boolean[][] visitedBoard, String word, int i, int j, int index) {
        if(index >= word.length()) return true;
        
        if(i < 0 || i >= rLength || j < 0 || j >= cLength || board[i][j] != word.charAt(index)) {
            return false;
        }
        
        if(visitedBoard[i][j]) return false;
        visitedBoard[i][j] = true;
        
        int[] rowOffsets = {0, 1, 0, -1};
        int[] colOffsets = {1, 0, -1, 0};
        
        for(int k = 0; k < 4; ++k) {
            if(search(board, visitedBoard, word, i + rowOffsets[k], j + colOffsets[k], index + 1)) return true;
        }
        
        visitedBoard[i][j] = false;
        
        return false;
    }

}
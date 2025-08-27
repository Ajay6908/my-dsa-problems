class Solution {
    private static boolean isValid(char[][] board, int row, int col, char num) {
        for (int i = 0; i < 9; i++) {
            // row check
            if (board[row][i] == num) return false;
            // col check
            if (board[i][col] == num) return false;
            // 3x3 sub-box check
            int boxRow = 3 * (row / 3) + i / 3;
            int boxCol = 3 * (col / 3) + i % 3;
            if (board[boxRow][boxCol] == num) return false;
        }
        return true;
    }
    public static boolean backtrack(char[][] mat)
    {
        int n = mat.length;
        int m = mat[0].length;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(mat[i][j]=='.')
                {
                    for(char k='1';k<='9';k++)
                    {
                        if(isValid(mat,i,j,k))
                        {
                            mat[i][j] = k;
                            if(backtrack(mat)) return true;
                            mat[i][j] = '.';
                        }
                    }
                    return false;
                    
                }
            }
        }
        return true;

    }
    public void solveSudoku(char[][] mat) {
        backtrack(mat);
        
    }
}
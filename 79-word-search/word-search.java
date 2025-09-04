class Solution {
    public static boolean dfs(char[][] board,String word,int i,int j,int ind,int m,int n)
    {
        if(ind==word.length())
        {
            return true;
        }
        if(i<0||j<0||i>=m||j>=n||board[i][j]!=word.charAt(ind)) return false;
        char temp = board[i][j];
        board[i][j] = '#';
        boolean down = dfs(board,word,i+1,j,ind+1,m,n);
        boolean left = dfs(board,word,i,j-1,ind+1,m,n);
        boolean right = dfs(board,word,i,j+1,ind+1,m,n);
        boolean up = dfs(board,word,i-1,j,ind+1,m,n);
        board[i][j] = temp;
        return down||left||right||up;
    }
    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(board[i][j] == word.charAt(0))
                {
                    if(dfs(board,word,i,j,0,m,n))
                    return true;
                }
            }
        }
        return false;

        
    }
}
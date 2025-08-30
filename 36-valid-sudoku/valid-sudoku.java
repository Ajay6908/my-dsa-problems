class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i++)
        {
            Set hs=new HashSet<>();
            for(int j=0;j<9;j++)
            {
                if(hs.contains(board[i][j]+'0'))
                return false;
                if(board[i][j]!='.')
                {
                    hs.add(board[i][j]+'0');
                }
            }
        }
        for(int i=0;i<9;i++)
        {
            Set hs=new HashSet<>();
            for(int j=0;j<9;j++)
            {
                if(hs.contains(board[j][i]+'0'))
                return false;
                if(board[j][i]!='.')
                {
                    hs.add(board[j][i]+'0');
                }
            }
        }
        for(int i=0;i<9;i=i+3)
        {
            for(int j=0;j<9;j=j+3)
            {
                Set hs=new HashSet<>();
                for(int k=i;k<i+3;k++)
                {
                    for(int l=j;l<j+3;l++)
                    {
                        if(hs.contains(board[k][l]+'0'))
                        {
                            return false;
                        }
                        if(board[k][l]!='.')
                        hs.add(board[k][l]+'0');
                    }
                }
            }
        }
        return true;
        
        
    }
}
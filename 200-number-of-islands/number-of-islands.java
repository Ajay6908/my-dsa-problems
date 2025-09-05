class Solution {
    public static void dfs(int r,int c,int m,int n,char[][] grid)
    {
        if(r<0||c<0||r>m-1||c>n-1||grid[r][c]=='0')
        return;
        grid[r][c] = '0';
        dfs(r+1,c,m,n,grid);
        dfs(r,c+1,m,n,grid);
        dfs(r,c-1,m,n,grid);
        dfs(r-1,c,m,n,grid);
    }
    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int cnt = 0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(grid[i][j] == '1')
                {
                    cnt++;
                    dfs(i,j,m,n,grid);
                }
            }
        }
        return cnt;
        
    }
}
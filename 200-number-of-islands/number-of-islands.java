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
    public static void bfs(int rr,int cc,int m,int n,char[][] grid)
    {
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{rr,cc});
        int trax[] = {1,0,-1,0};
        int tray[] = {0,1,0,-1};
        while(!q.isEmpty())
        {
            int row = q.peek()[0];
            int col = q.peek()[1];
            q.poll();
            for(int i=0;i<4;i++)
            {
                int r = row + trax[i];
                int c = col + tray[i];
                if(r>=0&&r<m&&c>=0&&c<n&&grid[r][c]=='1')
                {
                    grid[r][c] = '0';
                    q.offer(new int[]{r,c});
                }
            }
        }
        
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
                    bfs(i,j,m,n,grid);
                }
            }
        }
        return cnt;
        
    }
}
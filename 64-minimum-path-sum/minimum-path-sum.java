class Solution {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int min = Integer.MAX_VALUE;
        int[][] dp = new int[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==0&&j==0)
                dp[i][j] = grid[i][j];
                else
                {
                    int up = i>0? dp[i-1][j]+grid[i][j]:Integer.MAX_VALUE;
                    int left = j>0? dp[i][j-1]+grid[i][j]:Integer.MAX_VALUE;
                    dp[i][j]=Math.min(left,up);
                }


            }
        }
        return dp[m-1][n-1];
        
    }
}
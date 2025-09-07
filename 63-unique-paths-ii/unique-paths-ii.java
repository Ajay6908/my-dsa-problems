class Solution {
    public int uniquePathsWithObstacles(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int dp[][] = new int[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==0&&j==0)
                dp[i][j] = 1;
                if(mat[i][j] == 1)
                {
                    dp[i][j] = 0;
                    continue;
                }
                if(i>0)
                {
                    dp[i][j] += dp[i-1][j];
                }
                if(j>0)
                {
                    dp[i][j] +=dp[i][j-1];
                }
                
            }
        }
        return dp[m-1][n-1];
        
    }
}
class Solution {
    public int uniquePathsWithObstacles(int[][] arr) {
        
        if (arr[0][0] == 1) return 0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                if(arr[i][j] == 1)
                arr[i][j] = -1;
            }
        }

        int m = arr.length;
        int n = arr[0].length;
        int[][] dp = new int[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                 if (arr[i][j] == -1) {
                    dp[i][j] = 0;
                    continue;
                }
                if(i==0&&j==0)
                dp[i][j] = 1;
              
                else
                {
                    int up = (i>0)?dp[i-1][j]:0;
                    int left = (j>0)?dp[i][j-1]:0;
                    dp[i][j] = up+left;
                }
            }
        }
        return dp[m-1][n-1];

        
    }
}
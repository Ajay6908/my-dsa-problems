class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int dp[][] = new int[m][n];
        for(int i=0;i<n;i++)
        {
            dp[0][i] = matrix[0][i];
        }
        int min = Integer.MAX_VALUE;
        for(int i=1;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                int up = dp[i - 1][j];
                int leftDiag = j > 0 ? dp[i - 1][j - 1] : Integer.MAX_VALUE;
                int rightDiag = j < n - 1 ? dp[i - 1][j + 1] : Integer.MAX_VALUE;

                dp[i][j] = matrix[i][j] + Math.min(up, Math.min(leftDiag, rightDiag));
            }
        }
        for(int i=0;i<n;i++)
        {
            min = Math.min(dp[m-1][i],min);
        }
        return min;

        
    }
}
class Solution {
    public static int recur(int[][] mat,int m,int n,int[][] dp)
    {
        if(m<0||n<0)
        return 0;
         if(dp[m][n]!=-1)
        return dp[m][n];
        if(m==0&&n==0)
        {
            return 1;
        }
       
        
        if(mat[m][n]==1)
        {
            return 0;
        }
        int up = recur(mat,m-1,n,dp);
        int left = recur(mat,m,n-1,dp);
        return dp[m][n]=up+left;
    }
    public int uniquePathsWithObstacles(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        if (mat[0][0] == 1 || mat[m - 1][n - 1] == 1) return 0;
        int dp[][] = new int[m][n];
        for(int[] a:dp)
        {
            Arrays.fill(a,-1);
        }
        int ans = recur(mat,m-1,n-1,dp);
        return ans;
        
    }
}
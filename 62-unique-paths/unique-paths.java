class Solution {
    public static int recur(int i, int j,int m,int n,int[][] dp)
    {
        if(i==0&&j==0)
        return 1;
        if(i<0||j<0)
        return 0;
        if(dp[i][j]!=-1)
        return dp[i][j];
        int up = recur(i-1,j,m,n,dp);
        int left = recur(i,j-1,m,n,dp);
        return dp[i][j]=up+left;
    }
    public int uniquePaths(int m, int n) {
        int dp[][] = new int[m][n];
        for(int[] rows:dp)
        Arrays.fill(rows,-1);
        int ans = recur(m-1,n-1,m,n,dp);
        return ans;
        
    }
}
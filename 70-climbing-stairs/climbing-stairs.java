class Solution {
    public static int recursion(int n,int[] dp)
    {
        if(n==1||n==0)
        return 1;
        if(dp[n]!=-1)
        return dp[n];
        dp[n]=recursion(n-1,dp)+recursion(n-2,dp);
        return dp[n];
    }
    public int climbStairs(int n) {
      
        int dp[] = new int[n+1];
          Arrays.fill(dp,-1);
        int ans = recursion(n,dp);
        return ans;
        
    }
}
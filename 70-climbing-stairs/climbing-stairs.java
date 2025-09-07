class Solution {
    public static int recur(int n, int[] dp)
    {
        if(n==0||n==1)
        {
            return 1;
        }
        if(dp[n]!=-1)
        {
            return dp[n];
        }
        return dp[n] = recur(n-1,dp)+recur(n-2,dp);
    }
    public int climbStairs(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        return recur(n,dp);
        

        
    }
}
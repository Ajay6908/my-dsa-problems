class Solution {
    public static int recur(int m,int n,String s,String t,int[][] dp)
    {
        if(m<0||n<0)
        return 0;
        if(dp[m][n]!=-1)
        return dp[m][n];
        if(s.charAt(m)==t.charAt(n))
        return dp[m][n]=1+recur(m-1,n-1,s,t,dp);
        return dp[m][n]=0+Math.max(recur(m-1,n,s,t,dp),recur(m,n-1,s,t,dp));
    }
    public int longestCommonSubsequence(String s, String t) {
        int m = s.length();
        int n = t.length();
        int dp[][] = new int[m][n];
        for(int a[]:dp)
        {
            Arrays.fill(a,-1);
        }
        int ans = recur(m-1,n-1,s,t,dp);
        return ans;
        
    }
}
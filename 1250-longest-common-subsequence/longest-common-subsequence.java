class Solution {
    public static int recur(String s,String t, int ind1,int ind2,int[][] dp)
    {
        if(ind2<0||ind1<0)
        return 0;
        if(dp[ind1][ind2]!=-1)
        return dp[ind1][ind2];
        if(s.charAt(ind1)==t.charAt(ind2))
        {
            return dp[ind1][ind2] =  1 + recur(s,t,ind1-1,ind2-1,dp);
        }
        else 
        {
            return dp[ind1][ind2] = Math.max(recur(s,t,ind1-1,ind2,dp),recur(s,t,ind1,ind2-1,dp));
        }

    }
    public int longestCommonSubsequence(String s, String t) {
        int m = s.length();
        int n = t.length();
        int[][] dp = new int[m+1][n+1];
        for(int i=0;i<m;i++)
        {
            dp[i][0] = 0;
        }
        for(int j=0;j<n;j++)
        {
            dp[0][j] = 0;
        }
        for(int i=1;i<=m;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(s.charAt(i-1)==t.charAt(j-1))
                {
                    dp[i][j] = 1+dp[i-1][j-1];
                }
                else
                {
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }

        return dp[m][n];
        
        
    }
}
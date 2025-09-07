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
        int[][] dp = new int[m][n];
        for(int a[] : dp)
        {
            Arrays.fill(a,-1);
        }
        int ans = recur(s,t,m-1,n-1,dp);
        return ans;
        
        
    }
}
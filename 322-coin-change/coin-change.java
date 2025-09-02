class Solution {
    public static int recur(int[] arr,int ind,int k,int[][] dp)
    {
        if(ind==0)
        {
            if(k%arr[ind]==0) return k/arr[ind];
            else return (int)1e9;
        }
        if(dp[ind][k]!=-1)
        return dp[ind][k];
        
        int move = Integer.MAX_VALUE;
        int nomove = recur(arr,ind-1,k,dp);
        if(k>=arr[ind])
        {
            move = 1+recur(arr,ind,k-arr[ind],dp);
        }
        return dp[ind][k] = Math.min(nomove,move);
    }
    public int coinChange(int[] arr, int k) {
        int n = arr.length;
        int dp[][] = new int[n][k+1];
        for(int i=0;i<=k;i++)
        {
            if(i%arr[0]==0)
            dp[0][i] = i/arr[0];
            else 
            dp[0][i] = (int)1e9;
        }
        for(int i=1;i<n;i++)
        {
            for(int j = 0;j<=k;j++)
            {
                int move = (int)1e9;
                int notmove = dp[i-1][j];
                if(j>=arr[i])
                {
                    move = 1+dp[i][j-arr[i]];
                }
                dp[i][j] = Math.min(move,notmove);
            }
        }
        return dp[n-1][k]==(int)1e9?-1:dp[n-1][k];
     
    }
}
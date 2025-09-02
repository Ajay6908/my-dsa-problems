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
        for(int[] temp:dp)
        {
            Arrays.fill(temp,-1);
        }
        int ans = recur(arr,n-1,k,dp);
        return (int)1e9==ans?-1:ans;
    }
}
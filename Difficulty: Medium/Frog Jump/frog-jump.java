// User function Template for Java
class Solution {
    public static int recur(int n,int arr[],int[] dp)
    {
       if(n==0)
       return 0;
       if(dp[n]!=-1)
       return dp[n];
       int left = Math.abs(arr[n]-arr[n-1]) + recur(n-1,arr,dp);
       int right = (int)1e9;
       if(n>1)
       {
           right = Math.abs(arr[n]-arr[n-2]) + recur(n-2,arr,dp);
       }
       return dp[n] = Math.min(left,right);
    }
    int minCost(int[] arr) {
        // code here
        int n = arr.length;
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        int ans = recur(n-1,arr,dp);
        return ans;
    }
}
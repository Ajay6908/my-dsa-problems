class Solution {
    public static boolean recur(int[] arr,int n, int k,int[][] dp)
    {
        if (n < 0) return false; 
        if(arr[n]==k||k==0)
        return true;
       
        if(k<0)
        return false;
        if(dp[n][k]!=-1)
        return dp[n][k]==0?false:true;
       
      
      
        boolean take = recur(arr,n-1,k-arr[n],dp);
        boolean notake = recur(arr,n-1,k,dp);
        dp[n][k] = take || notake ? 1 : 0;
        return take || notake;
        
    }

    static Boolean isSubsetSum(int arr[], int sum) {
        // code here
        int n = arr.length;
        int dp[][] = new int[n][sum+1];
                for (int row[] : dp)
            Arrays.fill(row, -1);
            n--;
        boolean flag = recur(arr,n,sum,dp);
        return flag;
    }
}
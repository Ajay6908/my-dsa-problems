    
    //fibonacci numbers
//     public static int fib(int n,int dp[])  
//     {
//         if(n<=1)
//         return n;
//         if(dp[n]!=-1)
//         {
//             return dp[n];
//         }
//         return dp[n] = fib(n-1,dp)+fib(n-2,dp);

//     }
//     public static void main(String args[])
//     {
//         int n = 2;
//         int dp[] = new int[n+1];
//         Arrays.fill(dp,-1);
//         System.out.println(fib(n,dp));
//     }   
// }
public class dp1{
    public static int fib(int n)
    {
        int dp[] = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        for(int i=2;i<=n;i++)
        {
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
     }
    public static void main(String[] args)
    {
        int n = 8;
        System.out.println(fib(n));
    }
}

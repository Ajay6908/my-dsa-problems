
import java.util.Arrays;

public class dp3 {
    // public static int fib(int[] a,int[] dp,int k,int n)
    // {
    //     int steps = Integer.MAX_VALUE;
    //     if(n==0)
    //     return 0;
    //     if(dp[n]!=-1)
    //     {
    //         return dp[n];
    //     }
    //     int temp = 0;
    //     for(int j=1;j<=k;j++)
    //     {
    //         if(n-j>0)
    //         temp = fib(a,dp,k,n-j)+Math.abs(a[n]-a[n-j]);
    //         steps = Math.min(steps, temp);
    //     }
    //     return dp[n]=steps;
    // }
    // //frog jump with k steps 
    // public static void main(String args[])
    // {
    //     int a[] = {30, 10, 60, 10, 60, 50};
    //     int n = 6;
    //     int dp[] = new int[n+1];
    //     int k = 2;
    //     Arrays.fill(dp,-1);
    //     int ans = fib(a,dp,k,n-1);
    //     System.out.println(ans);
    // }
    public static int fib(int a[],int[] dp,int k,int n)
    {
        dp[0] = 0;
        
        for(int i=1;i<n;i++)
        {
            int minSteps = Integer.MAX_VALUE;
            for(int j=1;j<=k;j++)
            {
                if(i-j>=0)
                {
                    dp[i] = dp[i-j]+Math.abs(a[i]-a[i-j]);
                    minSteps = Math.min(minSteps,dp[i]);
                }
            }
            dp[i] = minSteps;
        }
        return dp[n-1];
    }
    public static void main(String args[])
    {
        int n = 6;
        int a[] = {30, 10, 60, 10, 60, 50};
        int dp[] = new int[n+1];
        int k = 2;
        Arrays.fill(dp,-1);
        int ans = fib(a,dp,k,n);
        System.out.println(ans);
    }
}

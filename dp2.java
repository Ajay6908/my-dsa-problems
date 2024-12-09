
import java.util.Arrays;

public class dp2 {
    // public static int fib(int n,int[] a,int[] dp)
    // {
    //     int left;
    //     int right;
    //     if(n==0)
    //     return 0;
    //     if(dp[n]!=-1)
    //     {
    //         return dp[n];
    //     }
    //     left = fib(n-1,a,dp) + Math.abs(a[n]-a[n-1]);
    //     right = Integer.MAX_VALUE;
    //     if(n>1)
    //     right = fib(n-2,a,dp) + Math.abs(a[n]-a[n-2]);

    //     return dp[n]=Math.min(left,right);
    // }
    // //frog jump 
    // public static void main(String[] args)
    // {
    //     int n = 6;
    //     int a[] = {30,10,60,10,60,50};
    //     int dp[] = new int[n+1];
    //     Arrays.fill(dp,-1);
    //     int ans = fib(n-1,a,dp);
    //     System.out.println(ans);
    // }
    
    public static int fib(int n,int[] a,int[] dp)
    {
        int left;
        int right;
        dp[0] = 0;
        for(int i=1;i<=n;i++)
        {
            left = dp[i-1]+Math.abs(a[i]-a[i-1]);
            right = Integer.MAX_VALUE;
            if(i>1)
            right = dp[i-2]+Math.abs(a[i]-a[i-2]);
            dp[i] = Math.min(left,right);
        }
        return dp[n];
    }
    //frog jump 
    public static void main(String[] args)
    {
        int n = 6;
        int a[] = {30,10,60,10,60,50};
        int dp[] = new int[n+1];
        Arrays.fill(dp,-1);
        int ans = fib(n-1,a,dp);
        System.out.println(ans);
    }
}

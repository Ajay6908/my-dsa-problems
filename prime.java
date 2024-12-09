import java.util.*;
public class prime {
    //sieve of eratosthenes
    public static int[] isPrime(int n)
    {
        int[] parr= new int[n+1];
        for(int i=0;i<=n;i++)
        {
            parr[i] = 1;
        }
        for(int i=2;i<Math.sqrt(n);i++)
        {
            for(int j = i*i;j<=n;j+=i)
            {
                parr[j] = 0;
            }
        }
        return parr;
    }
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] primy = isPrime(n); 
        for(int i=2;i<n;i++)
        {
            if(primy[i]==1)
            System.out.print(i+" ");
        }
        in.close();
    }
    
}

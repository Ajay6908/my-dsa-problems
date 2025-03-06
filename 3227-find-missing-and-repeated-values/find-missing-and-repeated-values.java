class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        
        int n=grid.length;
        int ans[]=new int[2];
        boolean [] a=new boolean[n*n+1];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(a[grid[i][j]]==true)
                {
                    ans[0]=grid[i][j];
                }
                a[grid[i][j]]=true;
            }
        }
        for(int i=1;i<n*n+1;i++)
        {
            if(a[i]==false)
            {
                ans[1]=i;
                break;
            }
        }
        return ans;
        
        
    }
}
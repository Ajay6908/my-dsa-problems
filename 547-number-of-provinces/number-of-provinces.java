class Solution {
    public static void dfs(int node,int[][] mat, int[] vis)
    {
        vis[node] = 1;
        for(int neib = 0;neib<mat.length;neib++)
        {
            if(mat[node][neib]==1&&vis[neib]==0)
            {
                dfs(neib,mat,vis);
            }
        }
    }
    public int findCircleNum(int[][] mat) {
        int cnt = 0;
        int n = mat.length;
        int vis[] = new int[n];
        int start = 0;
        for(int i=0;i<n;i++)
        {
            if(vis[i]==0)
            {
            cnt++;
             dfs(i,mat,vis);
            }
        }
        return cnt;
       
        
    }
}
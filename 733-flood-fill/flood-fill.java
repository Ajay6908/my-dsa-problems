class Solution {
    public int[][] floodFill(int[][] mat, int sr, int sc, int color) {
        int old = mat[sr][sc];
        if(old==color)
        return mat;
        int n = mat.length;
        int m = mat[0].length;
        int vis[][] = new int[n][m];
        Queue<int[]> qu = new LinkedList<>();
        qu.offer(new int[]{sr,sc});
        mat[sr][sc] = color;
        int travx[] = {1,0,-1,0};
        int travy[] = {0,1,0,-1}; 
        while(!qu.isEmpty())
        {
            int x = qu.peek()[0];
            int y = qu.peek()[1];
            qu.poll();
            for(int i=0;i<4;i++)
            {
                int row = x+travx[i];
                int col = y+travy[i];
                if(row>=0&&row<n&&col>=0&&col<m&&mat[row][col]==old)
                {
                    mat[row][col] = color;
                    qu.offer(new int[]{row,col});
                }
            }
        }
        return mat;
        
    }
}
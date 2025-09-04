class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int bottom = n-1;
        int top = 0;
        while(top<=bottom)
        {
            for(int i=0;i<n;i++)
            {
                int swap = matrix[top][i];
                matrix[top][i] = matrix[bottom][i];
                matrix[bottom][i] = swap;
            }
            top++;
            bottom--;
        }
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                int swap = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = swap;
            }
        }

        
    }
}
class Solution {
    public int areaOfMaxDiagonal(int[][] mat) {
        int n = mat.length;
      
        double max = Integer.MIN_VALUE;
        int ans = 0;
        int maxarea = 0;

        for(int[] a:mat)
        {
            long temp = a[0]*a[0] + a[1]*a[1];
            ans = a[0]*a[1];
            double sqrt = Math.sqrt(temp);
            System.out.println(sqrt);
            if(sqrt>max)
            {
                max = sqrt;
                maxarea = ans;
            }
            else if(sqrt==max)
            {
                maxarea = Math.max(maxarea,ans);
            }
        }
        return maxarea;
    }
}
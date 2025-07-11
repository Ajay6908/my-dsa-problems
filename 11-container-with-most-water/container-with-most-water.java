class Solution {
    public int maxArea(int[] height) {
        int max = Integer.MIN_VALUE;
        int n = height.length;
        int i = 0;
        int j = n-1;
        while(i<j)
        {
            int l = height[i];
            int r = height[j];
            int temp_min = Math.min(l,r);
            int res = temp_min * (j-i);
            max = Math.max(max, res);
            if(l<r)
            i++;
            else
            j--;
        }
        return max;
        
    }
}
class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int l = 0;
        int r = 0;
        int n = nums.length;
        int ans = 0;
        int prod = 1;
        while(r<n)
        {
            prod = prod * nums[r];
            while(l<=r&&prod>=k)
            {
                prod = prod / nums[l];
                l++;
            }
            ans = ans + r-l+1;
            r++;
        }
        return ans;
        
    }
}
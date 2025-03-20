class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l = 0;
        int r = 0;
        int sum = 0;
        int n = nums.length;
        int min = Integer.MAX_VALUE;
        while(r<n)
        {
            sum = sum + nums[r];

            while(sum>=target)
            {
                
                sum = sum - nums[l];
                min = Math.min(min,r-l+1);
                
                l++;
            }
            //min = Math.min(sum,r-l);
            r++;
        }
        return min!=Integer.MAX_VALUE?min:0;
    }
}
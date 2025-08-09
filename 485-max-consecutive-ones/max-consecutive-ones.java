class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int cnt = 0;
        int n = nums.length;
        int l = 0;
        int r = 0;
        while(r<n)
        {
            if(nums[r]==0)
            {
                l = r+1;
            }
            else
            {
                max = Math.max(max,r-l+1);
            }
            r++;
        }
        return max;
        
    }
}
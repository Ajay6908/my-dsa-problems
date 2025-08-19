class Solution {
    public long zeroFilledSubarray(int[] nums) {
        int n = nums.length;
        long max = 0;
        int cnt = 0;
        int r = 0;
        int l = 0;
        while(r<n)
        {
            if(nums[r]==0)
            {
                l = r;
                while(r<n&&nums[r]==0)
                {
                    cnt++;
                    r++;
                }
                max =  max + (long)cnt*(cnt+1)/2;
            }
            else
            {
                cnt = 0;
                r++;
            }
            
        }
        return max;
        
    }
}
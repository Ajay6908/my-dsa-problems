class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int l = 0;
        int r = 0;
        int n = nums.length;
        int ans = 0;
        while(r<n)
        {
            if(nums[r]==0)
            l = r+1;
            else if(ans<r-l+1)
            {
                ans = r-l+1;
            }
            r++;
        }
        return ans;
        
    }
}
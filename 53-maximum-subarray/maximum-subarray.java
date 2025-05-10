class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        if(n==1)
        return nums[0];
        int maxsum = nums[0];
        int sum = 0;
        for(int i=0;i<n;i++)
        {
            
            if(sum<0)
            {
                sum = 0;
            }
            sum = sum + nums[i];
            maxsum = Math.max(maxsum,sum);
        }
        return maxsum;
        
    }
}
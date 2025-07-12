class Solution {
    public static int robbory(int[] nums, int start,int end)
    {
        int prev2 = 0;
        int prev = 0;
        int cur = 0;
        for(int i = start;i<=end;i++)
        {
            int take = nums[i];
            take += prev2;
            int nottake = prev;
            cur = Math.max(take,nottake);
            
            prev2 = prev;
            prev = cur;

        }
        return prev;
    }
    public int rob(int[] nums) {
        int n = nums.length;
        if(n==1)
        return nums[0];
        return Math.max(robbory(nums,0,n-2),robbory(nums,1,n-1));
    }
}
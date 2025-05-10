class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int cnt = 1;
        int max = Integer.MIN_VALUE;
        int last = Integer.MIN_VALUE;
        if(n==0)
        return 0;
        for(int i=0;i<n;i++)
        {
            if(nums[i]-1==last)
            {
                cnt++;
                last = nums[i];
            }
            else if(nums[i]==last)
            continue;
            else {
                cnt = 1;
                last = nums[i];
            }
             max = Math.max(cnt,max);
           
        }
        return max;
        
        
    }
}
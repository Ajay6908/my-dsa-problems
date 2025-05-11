class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closest = Integer.MAX_VALUE;
        int sum = 0;
        int n = nums.length;
        for(int i=0;i<n-2;i++)
        {
            int j = i+1;
            int k = n-1;
            while(j<k)
            {
                sum = nums[i] + nums[j] + nums[k];
                if(Math.abs(target-sum)<Math.abs(target-closest))
                {
                    closest = sum;
                }
                if(sum>target)
                {
                    k--;
                }
                else
                j++;
            }
        }
        return closest;
        
    }
}
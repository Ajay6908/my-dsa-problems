class Solution {
    public int longestOnes(int[] nums, int k) {
        int l=0;
        int r=0;
        int maxlen=Integer.MIN_VALUE;
        int n=nums.length;
        int z=0;
        while(r<n)
        {
            if(nums[r]==0)
            z++;
            while(z>k)
            {
                if(nums[l]==0)
                z--;
                l++;
            }
            maxlen=Math.max(maxlen,r-l+1);
            r++;
        }
        return maxlen;
        
    }
}
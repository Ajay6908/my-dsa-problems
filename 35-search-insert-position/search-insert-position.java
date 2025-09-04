class Solution {
    public int searchInsert(int[] nums, int k) {
        int first = 0;
        int n = nums.length;
        int last = n-1;
        int ans = n;
        while(first<=last)
        {
            int mid = (first+last)/2;
            if(nums[mid]>=k)
            {
                ans = mid;
                last = mid-1;
            }
            else{  
                first = mid+1;
            }
        }
        return ans;

        
    }
}
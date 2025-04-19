class Solution {
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        int pivot = -1;
        for(int i=n-2;i>=0;i--)
        {
            if(nums[i]<nums[i+1])
            {
                pivot = i;
                break;
            }
        }
        if(pivot == -1)
        {
            int left = 0;
            int right = n-1;
            while(left<=right)
            {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
                right--;
            }
        }
        else{
            for(int i=n-1;i>=0;i--)
            {
                if(nums[pivot]<nums[i])
                {
                    int swap = nums[pivot];
                    nums[pivot] = nums[i];
                    nums[i] = swap;
                    break;
                }
            }
            int l = pivot+1;
            int r = n-1;
            while(l<r)
            {
                int tem = nums[l];
                nums[l] = nums[r];
                nums[r] = tem;
                l++;
                r--;
            }
        }
        
    }
}
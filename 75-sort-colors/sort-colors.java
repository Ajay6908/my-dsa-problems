class Solution {
    public void sortColors(int[] nums) {
        int cnt[] = new int[3];
        int n = nums.length;
        for(int i=0;i<n;i++)
        {
            cnt[nums[i]]++;
        }
        int k = 0;
        for(int i=0;i<cnt.length;i++)
        {
            while(cnt[i]!=0)
            {
                nums[k++] = i;
                cnt[i]--; 
            }
        }

        
    }
}
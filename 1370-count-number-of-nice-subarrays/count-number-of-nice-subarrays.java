class Solution {
    public static int atmost(int[] nums,int k)
    {
        int odd=0;
        int l = 0;
        int r = 0;
        int n = nums.length;
        int cnt = 0;
        while(r<n)
        {
            if(nums[r]%2==1)
            odd++;
            
            while(odd>k)
            {

                if(nums[l]%2==1)
                {
                   
                    odd--;
                }
                  l++;
            }
         
                cnt+=(r-l+1);
            
            r++;
        }
        return cnt;
    }
    public int numberOfSubarrays(int[] nums, int k) {
        return atmost(nums,k) - atmost(nums,k-1);
        

        
    }
}
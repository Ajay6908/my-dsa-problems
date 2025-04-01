class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        int pow=1;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            pow=pow*nums[i];
            max=Math.max(max,pow);
            if(pow==0)
            pow=1;
            
         }
         pow=1;
         for(int i=n-1;i>=0;i--)
         {
            pow=pow*nums[i];
            max=Math.max(max,pow);
            if(pow==0)
            pow=1;
         }
         
         
         return max;
        
    }
}
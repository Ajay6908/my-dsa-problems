class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int ans[] = new int[nums.length*2];
        int k = n;
        for(int i=0;i<n;i++)
        {
            ans[i] = nums[i];
            ans[k] = nums[i];
            k++;
        }
        return ans;
                
        
    }
}
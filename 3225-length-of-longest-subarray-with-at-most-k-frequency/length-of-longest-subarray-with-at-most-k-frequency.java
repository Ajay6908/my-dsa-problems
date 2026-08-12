class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = nums.length;
        int sum = 0;
        int i = 0;
        int max = Integer.MIN_VALUE;
        for(int j=0;j<n;j++)
        {
            sum = sum + nums[j];
            map.put(nums[j],map.getOrDefault(nums[j],0)+1);
            while(map.get(nums[j])>k)
            {
                map.put(nums[i],map.get(nums[i])-1);

                   
                i++;
            }

            max = Math.max(max,j-i+1);  
        }
        return max;
        
    }
}
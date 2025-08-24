class Solution {
    public int longestSubarray(int[] nums) {
        int l = 0;
        int n = nums.length;
        int r = 0;
        int cnt = 0;
        int max = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        while(r<n)
        {
            if(nums[r]==0)
            cnt++;
            if(cnt>1)
            {
                if(map.containsKey(0))
                {
                 l = map.get(0)+1;
                 map.remove(0);
                 cnt--;
                }
            }
            map.put(nums[r],r);
            max = Math.max(max,r-l+1);
            r++;
        }
        return max-1;
        
    }
}
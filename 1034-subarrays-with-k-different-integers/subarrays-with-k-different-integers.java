class Solution {
    public static int atmost(int[] nums,int k)
    {
        HashMap<Integer,Integer> map = new HashMap<>();
        int l = 0;
        int r = 0;
        int cnt = 0;
        int n = nums.length;
        while(r<n)
        {
            map.put(nums[r],map.getOrDefault(nums[r],0)+1);
            while(map.size()>k)
            {
                int temp = map.get(nums[l]);
                temp--;
                map.put(nums[l],temp);
                if(temp==0)
                map.remove(nums[l]);
                l++;
            }
           
            cnt +=(r-l+1);
            r++;
        } 
        return cnt;
    }
    public int subarraysWithKDistinct(int[] nums, int k) {
        return atmost(nums,k) - atmost(nums,k-1);
        
    }
}
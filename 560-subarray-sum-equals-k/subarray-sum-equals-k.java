class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int l = 0;
        int r = 0;
        int n = nums.length;
        int sum = 0;
        int cnt=0;
        map.put(0,1);
        while(r<n)
        {
            sum = sum + nums[r];
            
            if(map.containsKey(sum-k))
            {
                cnt+=map.get(sum-k);
            } 
            map.put(sum,map.getOrDefault(sum,0)+1); 
            r++;  
        }
        return cnt;
        
    }
}
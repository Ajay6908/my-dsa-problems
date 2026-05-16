class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = nums.length;
        for(int i=0;i<n;i++)
        {
            if(map.containsKey(target-nums[i]))
            {
                int num = map.get(target-nums[i]);
                return new int[]{num,i};
            }
            map.put(nums[i],i);
        }
        return new int[]{0,0};
        
    }
}
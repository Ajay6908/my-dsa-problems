class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;
        int size=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num:nums)
        {
            map.put(num,map.getOrDefault(num,0)+1);    
        }
        List<Integer> list = new ArrayList<>(map.keySet());
        list.sort((a,b)->map.get(b)-map.get(a));
        int res[]=new int[k];
        for(int i=0;i<k;i++)
        {
            res[i] = list.get(i);
        }
        return res;
       
        
    }
}
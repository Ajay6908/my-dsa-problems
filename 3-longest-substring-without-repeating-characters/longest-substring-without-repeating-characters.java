class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int l = 0;
        int r = 0;
        int cnt = 0;
        int max = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        while(r<n)
        {
            char c = s.charAt(r);
            if(map.containsKey(c))
            {
                l = Math.max(l,map.get(c)+1);
                
            }
            max = Math.max(max,r-l+1);
            map.put(c,r);
            r++;
        }
        return max;
        
    }
}
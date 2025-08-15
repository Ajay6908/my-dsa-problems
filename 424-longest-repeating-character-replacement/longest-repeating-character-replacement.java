class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer> map = new HashMap<>();
        int l = 0;
        int r = 0;
        int n = s.length();
        int maxlen = 0;
        int maxfrq = 0;
        while(r<n)
        {
            map.put(s.charAt(r),map.getOrDefault(s.charAt(r),0)+1);
            maxfrq = Math.max(maxfrq,map.get(s.charAt(r)));
            int len = r-l+1;
            while((r-l+1)-maxfrq>k)
            {
                map.put(s.charAt(l),map.get(s.charAt(l))-1);
                l++;
                
            }
            maxlen = Math.max(maxlen,r-l+1);
            r++;
        }
        return maxlen;
        
    }
}
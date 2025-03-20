class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int l = 0;
        int n = s.length();
        int r = 0;
        int maxlen = 0;
        while(r<n)
        {
            while(set.contains(s.charAt(r)))
            {
                set.remove(s.charAt(l));
                l++;
            }

            set.add(s.charAt(r));
            maxlen = Math.max(maxlen,r-l+1);
            r++;
        }
        return maxlen;
        
    }
}
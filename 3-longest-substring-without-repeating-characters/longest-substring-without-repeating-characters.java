class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int l = 0;
        int r = 0;
        int n = s.length();
        int maxlen = 0;
        while(r<n)
        {
            char c = s.charAt(r);
            while(l<r&&set.contains(c))
            {
                set.remove(s.charAt(l));
                l++;
            }
            maxlen = Math.max(maxlen,r-l+1);
            set.add(c);
            r++;
        }
        return maxlen;
        
    }
}
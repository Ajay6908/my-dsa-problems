class Solution {
    public String minWindow(String s, String t) {
        int n = s.length();
        int m = t.length();
        int cnt = t.length();
        int r = 0;
        int l = 0;
        int min = Integer.MAX_VALUE;
        HashMap<Character,Integer> map = new HashMap<>();
        int start = 0;
        for(char c:t.toCharArray())
        {
            map.put(c,map.getOrDefault(c,0)+1);
        }

        while(r<n)
        {
            char c = s.charAt(r);
            if(map.containsKey(c))
            {
                if(map.get(c)>0)
                cnt--;
                map.put(c,map.get(c)-1);
            }
            while(cnt==0)
            {
                if(min>r-l+1)
                {
                    min = r-l+1;
                    start = l;
                }
                char cl = s.charAt(l);
                if(map.containsKey(cl))
                {
                    map.put(cl,map.get(cl)+1);
                    if(map.get(cl)>0)
                    {
                        cnt++;
                    }
                }
                l++;
            }
            r++;
        }
        return min == Integer.MAX_VALUE?"":s.substring(start,start+min);
    }
}
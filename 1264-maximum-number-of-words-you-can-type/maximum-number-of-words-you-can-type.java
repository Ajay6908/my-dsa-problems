class Solution {
    public int canBeTypedWords(String text, String brok) {
        String str[] = text.trim().split("\\s");

        int n = str.length;

        char c[] = brok.toCharArray();
        int cnt = n;
        HashSet<Character> set = new HashSet<>();
        for(int i=0;i<c.length;i++)
        {
            set.add(brok.charAt(i));
        }
        for(int i=0;i<n;i++)
        {
            String s = str[i];
            for(int j=0;j<s.length();j++)
            {
                if(set.contains(s.charAt(j)))
                {
                    cnt--;
                    break;
                }
            }
        }
        return cnt;

        
    }
}
class Solution {
    public int lengthOfLastWord(String s) {
        int n = s.length();
        boolean flag = false;
        int cnt = 0;

        if(n==1)
        {
            return s.charAt(0)==' '?0:1;
        }
        for(int i = n-1;i>=0;i--)
        {
            if(s.charAt(i)==' '&&!flag)
            {
                continue;
            }
            else if(s.charAt(i)!=' ')
            {
                cnt++;
                flag = true;
            }
            else
            {
                return cnt;
            }

        }

        return cnt;
        
    }
}
class Solution {
    public int lengthOfLastWord(String s) {
        int n = s.length();
        if(n==1)
        {
            return s.charAt(0)==' '?0:1;
        }
        int cnt = 0;
        boolean flag = false;
        for(int i=n-1;i>=0;i--)
        {
            if(s.charAt(i)==' '&&!flag)
            {
                continue;
            }
            if(s.charAt(i)!=' ')
            {
                flag = true;
                cnt++;
            }
            else
            {
                return cnt;
            }
        }
        return cnt;
        
    }
}
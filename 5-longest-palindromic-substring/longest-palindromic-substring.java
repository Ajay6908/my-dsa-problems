class Solution {
    public static int checkPalindrome(String s, int left, int right)
    {
        while(left>=0&&right<s.length()&&s.charAt(left)==s.charAt(right))
        {
            left--;
            right++;
        }
        return right-left-1;
    }
    public String longestPalindrome(String s) {
        if(s==null||s.length()==0)
        return "";
        int start = 0;
        int end = 0;
        for(int i=0;i<s.length();i++)
        {
            int odd = checkPalindrome(s,i,i);
            int even = checkPalindrome(s,i,i+1);
            int max_len = Math.max(even,odd);
            if(max_len>end-start)
            {
                start = i-(max_len-1)/2;
                end = i + max_len/2;
            }
        }
        return s.substring(start,end+1);
        
        
    }
}
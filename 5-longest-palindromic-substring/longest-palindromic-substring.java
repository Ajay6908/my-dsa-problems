class Solution {
    public static int check(String s,int left,int right)
    {
        while(left>=0&&right<s.length()&&s.charAt(left)==s.charAt(right))
        {
            left--;
            right++;
        }
        return right-left-1;
    }
    public String longestPalindrome(String s) {
        int n = s.length();
        if(n==0) return "";
        int start=0;
        int end = 0;
        for(int i=0;i<n;i++)
        {
            int odd = check(s,i,i);
            int even = check(s,i,i+1);
            int max = Math.max(even,odd);
            if(max>end-start)
            {
                start = i-(max-1)/2;
                end = i+max/2;
            }
            
        }
        return s.substring(start,end+1);
        
    }
}
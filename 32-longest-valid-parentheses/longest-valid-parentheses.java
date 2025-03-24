class Solution {
    public int longestValidParentheses(String s) {
        int left = 0;
        int right = 0;
        int max = Integer.MIN_VALUE;
        int n = s.length();
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)=='(')
            left++;
            else if(s.charAt(i)==')')
            right++;
            if(right>left)
            {
                left = 0;
                right = 0;
            }
            if(left == right)
            {
                max = Math.max(max, left*2);
            }
        }
        left = 0;
        right = 0;
        for(int i=n-1;i>=0;i--)
        {
            if(s.charAt(i)=='(')
            left++;
            else if(s.charAt(i)==')')
            right++;
            if(left>right)
            {
                left = 0;
                right = 0;
            }

            if(left == right)
            {
                max = Math.max(max, left*2);
            }
        }
        return max==Integer.MIN_VALUE?0:max;
        
    }
}
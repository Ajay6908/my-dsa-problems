class Solution {
    public static boolean check(String s, int left,int right)
    {
        while(left<right)
        {
            if(s.charAt(left)!=s.charAt(right))
            return false;
            left++;
            right--;
        }
        return true;
    }

    public boolean validPalindrome(String s) {
        int n = s.length();
        int l = 0;
        int r = n-1;
        while(l<r)
        {
            if(s.charAt(l)!=s.charAt(r))
            {
                return check(s,l+1,r)||check(s,l,r-1);
            }
            l++; 
            r--;
        }
        return true;
        
    }
}
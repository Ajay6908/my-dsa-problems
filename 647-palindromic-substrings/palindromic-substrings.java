class Solution {
    public static int ispalindrome(String s,int left,int right)
    {
        int count = 0;
        while(left>=0&&right<s.length()&&s.charAt(left)==s.charAt(right))
        {
          
                count++;
               
                
            
             left--;
                right++;
        }
        return count;
    }
    public int countSubstrings(String s) {
        int n = s.length();
        int cnt = 0;
        for(int i=0;i<n;i++)
        {
            cnt+=ispalindrome(s,i,i);
            cnt+=ispalindrome(s,i,i+1);
        }
        return cnt;
        
    }
}
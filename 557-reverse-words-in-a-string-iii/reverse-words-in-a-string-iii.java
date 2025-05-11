class Solution {
    public static String reverse(String temp)
    {
        StringBuilder tp = new StringBuilder(temp);
        return tp.reverse().toString();
    }
    public String reverseWords(String s) {
        String str[] = s.trim().split(" ");
        int n = str.length;
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<n;i++)
        {
            String rev = reverse(str[i]);
            ans.append(rev);
            if(i!=n-1)
            ans.append(" ");
        }
        return ans.toString();
    }
}
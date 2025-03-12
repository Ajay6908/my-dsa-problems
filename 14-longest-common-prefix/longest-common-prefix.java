class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n = strs.length;
        Arrays.sort(strs);
        StringBuilder str = new StringBuilder();
        String ft = strs[0];
        String lt = strs[n-1];
        for(int i=0;i<Math.min(ft.length(),lt.length());i++)
        {
            if(ft.charAt(i)==lt.charAt(i))
            {
                str.append(ft.charAt(i));
            }
            else
            break;
        }
        return str.toString();
    }
}
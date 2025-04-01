class Solution {
    public int partitionString(String s) {
        int i=0;
        int ans = 1;
        HashSet<Character> set = new HashSet<>();
        while(i<s.length())
        {
           if(set.contains(s.charAt(i)))
           {
            ans = ans+1;
            set.clear();
           } 
           set.add(s.charAt(i));
           i++;
        }
        return ans;
        
    }
}
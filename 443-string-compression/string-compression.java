class Solution {
    public int compress(char[] chars) {
        int n = chars.length;

        int left = 0;
        int right = 0;
        while(right<n)
        {
            char c = chars[right];
            int count = 0;
            while(right<n&&c==chars[right])
            {
                count++;
                right++;
            }
            chars[left] = c;
            left+=1;
            if(count>1)
            {
                String str = String.valueOf(count);
            for(int i=0;i<str.length();i++)
            {
                chars[left++] = str.charAt(i); 
            }
            }
            
        }
        return left;
        
        
    }
}
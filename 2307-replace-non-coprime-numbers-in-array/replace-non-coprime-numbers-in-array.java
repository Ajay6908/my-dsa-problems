class Solution {
    public static boolean check(int a,int b)
    {
        return gcd(a,b)>1;
    }
    public static int gcd(int a,int b)
    {
        if(b==0)
        return a;
        return gcd(b,a%b);
    }
    public List<Integer> replaceNonCoprimes(int[] nums) {
        Stack<Integer> st = new Stack<>();
        int mod = (int)1e9;
        int n = nums.length;
        for(int i=0;i<n;i++)
        {
            if(st.isEmpty())
            {
                st.push(nums[i]);
                continue;
            }
            
            int num = nums[i];
            while(!st.isEmpty()&&check(st.peek(),num))
            {
                int peek = st.pop();
                num = (int)((long)peek / gcd(peek,num) * num);
            }
            
                st.push(num);
            
        }
        List<Integer> ans = new ArrayList<>();
        while(!st.isEmpty())
        {
            ans.add(st.pop());
        }
        Collections.reverse(ans);
        return ans;

        
    }
}
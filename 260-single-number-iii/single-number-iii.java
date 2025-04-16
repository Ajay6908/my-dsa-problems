class Solution {
    public int[] singleNumber(int[] nums) {
        int a = 0;
        int b = 0;
        int xor = 0;
        for(int num: nums)
        {
            xor ^=num;
        }
        int rightsetbit = xor&-xor;
        for(int num: nums)
        {
            if((num & rightsetbit)!=0)
            a=a^num;
            else
            b=b^num;
        }
        return new int[] {a,b};
        
    }
}
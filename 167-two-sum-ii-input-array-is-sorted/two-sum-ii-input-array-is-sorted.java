class Solution {
    public int[] twoSum(int[] num, int target) {
        int n = num.length;
        int first = 0;
        int last = n-1;
        while(first<last)
        {
            if(num[first]+num[last]==target)
            {
                return new int[]{first+1,last+1};
            }
            else if(num[first]+num[last]>target)
            {
                last--;
            }
            else{
                first++;
            }
        }
        return new int[]{-1,-1};
        
    }
}
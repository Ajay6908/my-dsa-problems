class Solution {
    public long minSum(int[] nums1, int[] nums2) {
       long s1 = 0, s2 = 0, nz1=0, nz2 = 0;
       for(int num:nums1)
       {
        if(num==0)
        nz1++;
        s1=s1+num;
       }
        for(int num:nums2)
       {
        if(num==0)
        nz2++;
        s2=s2+num;
       }
       long min1 = s1+nz1;
       long min2 = s2+nz2;
       if(nz1==0&&nz2==0)
       return s1==s2?s1:-1;
       else if(nz1==0)
       return s2+nz2<=s1?s1:-1;
       else if(nz2==0)
       return s1+nz1<=s2?s2:-1;

       return Math.max(min1,min2); 
    }
}
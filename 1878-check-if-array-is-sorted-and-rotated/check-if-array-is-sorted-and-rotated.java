class Solution {
    public boolean check(int[] a) {
        int n = a.length;
        int cnt = 0;
        for(int i = 0;i<n;i++)
        {
            if(a[i]>a[(i+1)%n])
            cnt++;
        }
        return cnt<=1;
        
    }
}
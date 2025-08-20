class Solution {
    public int findPeakElement(int[] arr) {
        int n = arr.length;
        int low = 0;
        int high = n-1;
        if(n==1||n==0)
        return 0;
        if(n==2)
        return arr[0]>arr[1]?0:1;
        while(low<=high)
        {
            int mid = (low+high)/2;
            if(((mid==0)||arr[mid-1]<arr[mid])&&((mid==high)||arr[mid]>arr[mid+1]))
            {
                return mid;
            }
            else if(mid<n-1&&arr[mid]<arr[mid+1])
            {
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return 0;
        
    }
}
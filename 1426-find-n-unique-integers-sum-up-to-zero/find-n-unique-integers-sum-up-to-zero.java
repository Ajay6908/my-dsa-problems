class Solution {
    public int[] sumZero(int n) {
        int arr[] = new int[n];
        int left = 0;
        int right = 0;
        int k=0;
        while(right!=n/2)
        {
            left--;
            arr[k++] = left;
            right++;
            arr[k++] = right;
        }
        return arr;

        
    }
}
class Solution {
    public void moveZeroes(int[] arr) {
        int n=arr.length;
        int count = 0;
        int i =0;
        while(i<n)
        {
            if(arr[i]!=0)
            {
            arr[count++] = arr[i];
            }
            i++;
        }
        while(count<n)
        {
            arr[count++] = 0;
        }



        
        
    }
}
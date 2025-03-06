//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            String[] str = br.readLine().trim().split(" ");
            int n = Integer.parseInt(str[0]);
            int k = Integer.parseInt(str[1]);
            str = br.readLine().trim().split(" ");
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(str[i]);
            }

            long ans = new Solution().countSubarray(arr, n, k);

            System.out.println(ans);
        
System.out.println("~");
}
    }
}

// } Driver Code Ends


// User function Template for Java

// Back-end complete function Template for Java

class Solution {
    // Return number of subarrays whose maximum
    // element is less than or equal to K.
    long countSubarray(int arr[], int n, int k) {

        // To store count of subarrays with all
        // elements less than or equal to k.
        long s = 0;

        // Traversing the array.
        int i = 0;
        while (i < n) {

            // If element is greater than k, ignore.
            if (arr[i] > k) {
                i++;
                continue;
            }

            // Counting the subarray length whose
            // each element is less than equal to k.
            long count = 0;
            while (i < n && arr[i] <= k) {
                i++;
                count++;
            }

            // Suming number of subarray whose
            // maximum element is less than equal to k.
            s += ((count * (count + 1)) / 2);
        }

        return ((long)n * (long)(n + 1) / 2 - s);
    }
}
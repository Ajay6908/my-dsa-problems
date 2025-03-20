class Solution {
    public int maxSumTwoNoOverlap(int[] nums, int len1, int len2) {
        int n = nums.length;
        int[] prefix = new int[n + 1];

        // Compute prefix sum array
        for (int i = 1; i <= n; i++) {
            prefix[i] = prefix[i - 1] + nums[i - 1];
        }

        // Check both orders and return the maximum sum
        return Math.max(maxSum(prefix, len1, len2), maxSum(prefix, len2, len1));
    }

    private int maxSum(int[] prefix, int len1, int len2) {
        int maxFirst = 0; // Maximum sum of first subarray of length `len1`
        int result = 0;   // Maximum total sum of both subarrays

        for (int i = len1 + len2; i < prefix.length; i++) {
            // Update maxFirst to store the best sum of the first subarray of length `len1`
            maxFirst = Math.max(maxFirst, prefix[i - len2] - prefix[i - len2 - len1]);

            // Update the result with the best possible sum
            result = Math.max(result, maxFirst + prefix[i] - prefix[i - len2]);
        }

        return result;
    }
}

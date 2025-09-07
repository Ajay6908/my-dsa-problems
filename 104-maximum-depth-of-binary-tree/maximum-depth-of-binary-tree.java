/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public static int recur(TreeNode root)
    {
        if(root==null)
        return 0;
        int left = recur(root.left);
        int right = recur(root.right);
        return 1+Math.max(left,right);
    }
    public int maxDepth(TreeNode root) {
        int ans= recur(root);
        return ans;
        
    }
}
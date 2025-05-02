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
    public static int diameter(TreeNode root,int[] max)
    {
        if(root==null)
        return 0;
        int l = diameter(root.left,max);
        int r = diameter(root.right,max);
        max[0] = Math.max(max[0], l+r);
        return 1+Math.max(l,r);
    }
    public int diameterOfBinaryTree(TreeNode root) {
        int val[] = {0};
        int res = diameter(root,val);
        return val[0];
        
    }
}
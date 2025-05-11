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
    public static int diameter(TreeNode root, int[] store)
    {
        if(root==null)
        return 0;
        int l = diameter(root.left,store);
        int r = diameter(root.right,store);
        store[0] = Math.max(store[0],l+r);
        return 1+Math.max(l,r);
    }
    public int diameterOfBinaryTree(TreeNode root) {
        int[] store = {0};
        diameter(root, store);
        return store[0];
        
    }
}
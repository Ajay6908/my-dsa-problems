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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> store = new ArrayList<>();
        queue.offer(root);
        if(root==null)
        return store;
        boolean zigzag = false;
        while(!queue.isEmpty())
        {
            int n = queue.size();
            List<Integer> level = new ArrayList<>();
            for(int i=0;i<n;i++)
            {
                TreeNode node = queue.poll();
                if(zigzag)
                {
                    level.add(0,node.val);
                }
                else{
                    level.add(node.val);
                }
                if(node.left!=null)
                {
                    queue.offer(node.left);
                }
                if(node.right!=null)
                {
                    queue.offer(node.right);
                }
                
            }
            zigzag = !zigzag;
            store.add(level);
        }
        return store;

        
    }
}
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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
         Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> store = new LinkedList<>();
        if(root==null)
        return store;
        queue.offer(root);
        while(!queue.isEmpty())
        {
            int levelnum = queue.size();
            List<Integer> level = new LinkedList<>();
            for(int i=0;i<levelnum;i++)
            {
                if(queue.peek().left!=null)
                {
                    queue.offer(queue.peek().left);
                }
                if(queue.peek().right!=null)
                {
                    queue.offer(queue.peek().right);
                }
                level.add(queue.poll().val);
            }
             store.add(level);
            
        }
        Collections.reverse(store);
        return store;   

        
    }
}
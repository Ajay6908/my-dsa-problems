class Solution {
    // Function to return Breadth First Search Traversal of given graph.
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        int n = adj.size();
        int vis[] = new int[n];
        Queue<Integer> q = new LinkedList<>();
        q.offer(0);
        vis[0] = 1;
        ArrayList<Integer> al = new ArrayList<>();
        while(!q.isEmpty())
        {
            int node = q.poll();
            al.add(node);
            for(int num:adj.get(node))
            {
                if(vis[num]==0)
                {
                q.offer(num);
                vis[num] = 1;
                }
            }
        }
        return al;
    }
}
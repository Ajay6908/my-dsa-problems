class Solution {
    public static void dfs(int node,int[] vis,ArrayList<ArrayList<Integer>> adj,int n,ArrayList<Integer> al)
    {
        vis[node] = 1;
        al.add(node);
        for(int num:adj.get(node))
        {
            if(vis[num]==0)
            {
                dfs(num,vis,adj,n,al);
            }
        }
        
    }
    // Function to return a list containing the DFS traversal of the graph.
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        // Code here
        int n = adj.size();
        int vis[] = new int[n];
        ArrayList<Integer> al = new ArrayList<>();
        dfs(0,vis,adj,n,al);
        return al;
        
    }
}
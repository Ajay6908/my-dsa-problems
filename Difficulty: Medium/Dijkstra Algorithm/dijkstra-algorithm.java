class Pair{
    int dist;
    int node;
    Pair(int dist,int node)
    {
        this.dist = dist;
        this.node = node;
    }
}
class Solution {
    public int[] dijkstra(int V, int[][] edges, int src) {
        // code here
        int[] dist = new int[V];
        Arrays.fill(dist, (int)1e9);
        dist[src] = 0;
        ArrayList<ArrayList<int[]>> adj = new ArrayList<>();
        for(int i=0;i<V;i++)
        {
            adj.add(new ArrayList<>());
        }
        for(int[] edge:edges)
        {
            adj.get(edge[0]).add(new int[]{edge[1],edge[2]});
        }
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b)->a.dist-b.dist);
        pq.offer(new Pair(0,src));
        
        while(!pq.isEmpty())
        {
            int dis = pq.peek().dist;
            int curr = pq.peek().node;
            pq.poll();
            for(int node[]:adj.get(curr))
            {
                int edge = node[0];
                int wet = node[1];
                if(wet+dis<dist[edge])
                {
                    dist[edge] = wet+dis;
                    pq.offer(new Pair(dist[edge], edge));

                }
            }
        }
        return dist;
    }
}
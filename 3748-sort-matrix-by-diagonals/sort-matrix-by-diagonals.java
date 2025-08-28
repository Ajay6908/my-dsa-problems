class Solution {
    public int[][] sortMatrix(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        HashMap<Integer,PriorityQueue<Integer>> map = new HashMap<>();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                int key = i-j;
                if(i>=j)
                map.putIfAbsent(key,new PriorityQueue<>(Collections.reverseOrder()));
                else
                map.putIfAbsent(key,new PriorityQueue<>());
                map.get(key).add(grid[i][j]);
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                int key = i-j;
                grid[i][j] = map.get(key).poll();
            }
        }
        return grid;
        
    }
}
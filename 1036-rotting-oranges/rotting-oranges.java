class Pair {
    int row, col, cnt;
    Pair(int row, int col, int cnt) {
        this.row = row;
        this.col = col;
        this.cnt = cnt;
    }
}

class Solution {
    public int orangesRotting(int[][] grid) {
        int n = grid.length, m = grid[0].length;
        Queue<Pair> q = new LinkedList<>();
        int fresh = 0;

        // Step 1: count fresh & push rotten oranges to queue
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 2) {
                    q.offer(new Pair(i, j, 0));
                } else if (grid[i][j] == 1) {
                    fresh++;
                }
            }
        }

        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, 1, 0, -1};
        int max = 0, count = 0;

        // Step 2: BFS
        while (!q.isEmpty()) {
            Pair p = q.poll();
            int row = p.row, col = p.col, cnt = p.cnt;
            max = Math.max(max, cnt);

            for (int i = 0; i < 4; i++) {
                int r = row + dx[i], c = col + dy[i];
                if (r >= 0 && r < n && c >= 0 && c < m && grid[r][c] == 1) {
                    grid[r][c] = 2; // mark as rotten
                    q.offer(new Pair(r, c, cnt + 1));
                    count++;
                }
            }
        }

        return (count == fresh) ? max : -1;
    }
}

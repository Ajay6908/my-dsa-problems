class Solution {
    public int[][] merge(int[][] arr) {
        Arrays.sort(arr,(a,b)->Integer.compare(a[0],b[0]));
        List<int[]> res = new ArrayList<>();
        int[] current = arr[0];
        res.add(current);
        for(int traverse[]:arr)
        {
            if(traverse[0]<=current[1])
            {
                current[1] = Math.max(current[1],traverse[1]);
            }
            else
            {
                current = traverse;
                res.add(current);
            }
        }
        return res.toArray(new int[res.size()][]);
    }
}
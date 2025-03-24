class Solution {
    public int countDays(int d, int[][] arr) {
        Arrays.sort(arr,(a,b)->
            Integer.compare(a[0], b[0])
        );
        int cnt = 0;
        int temp = 1;
        for(int a[]:arr)
        {
            cnt += Math.max(0, a[0]-temp);
            temp = Math.max(temp,a[1]+1);
            if(temp>d) break;
        }
        return cnt + Math.max(0,d-temp+1);
        

       // return cnt;



        
    }
}
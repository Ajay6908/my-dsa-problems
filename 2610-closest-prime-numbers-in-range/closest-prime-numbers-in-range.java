class Solution {
    public int[] closestPrimes(int left, int right) {
        int n = right+1;
        int prime[] = new int[n];
        Arrays.fill(prime,1);
        for(int i = 2;i*i<n;i++)
        {
            if(prime[i] == 1){
            for(int j = i*i;j<n;j+=i)
            {
                prime[j] = 0;
            }
            }
        }
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=Math.max(2,left);i<=right;i++)
        {
            if(prime[i]==1)
            {
                al.add(i);
            }
        }
        int min = Integer.MAX_VALUE;
        int num1 = -1;
        int num2 = -1;
        int diff = 0;
        for(int i=0;i<al.size()-1;i++)
        {
            diff = al.get(i+1)-al.get(i);
            if(diff<min)
            {
                min = diff;
                num1 = al.get(i);
                num2 = al.get(i+1);
            }
        }
        return new int[]{num1,num2};
        
    }
}
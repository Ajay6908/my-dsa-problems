class Solution {
    public int maxProfit(int[] price) {
        int min = price[0];
        int n = price.length;
        int sum = 0;
       for(int i=1;i<n;i++)
        {
            if(price[i]>price[i-1])
            sum = sum + price[i]-price[i-1];
        }
        return sum;
        
    }
}
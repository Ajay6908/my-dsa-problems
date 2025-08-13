class Solution {
    
    public int climbStairs(int n) {
      
        int prev = 1;
        int secprev = 1;
        int curr = 0;
        for(int i=2;i<=n;i++)
        {
            curr = prev + secprev;
            secprev = prev; 
            prev = curr;
            
            
        }
        return prev;
        
    }
}
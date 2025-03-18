class Solution {
    public boolean isPalindrome(int x) {
        int sum=0,n,temp;
        temp=x;

        while(x>0){
             n=x%10;
             sum=(sum*10)+n;
             x=x/10;
        }
        
        return true?temp==sum:false;
        
    }
}
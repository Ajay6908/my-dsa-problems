class Solution {
    public static int square(int num)
    {
        int sum=0;
        while(num>0)
        {
            int temp = num%10;
            sum += temp*temp;
            num/=10;
        }
        return sum;
    }
    public boolean isHappy(int n) {
        //using slow and fast pointer
        int slow = n;
        int fast = n;
        do{
            slow = square(slow);
            fast = square(square(fast));
        } while(slow!=fast);
        return slow == 1;
        
    }
}
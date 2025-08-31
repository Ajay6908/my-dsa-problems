class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        int cnt1 = 0;
        int cnt2 = 0;
        int cad1 = -1;
        int cad2 = -1;
        for(int i=0;i<n;i++)
        {
           if(nums[i]==cad1)
           cnt1++;
           else if(nums[i]==cad2&&cad1!=cad2)
           cnt2++;
           else if(cnt1==0)
           {
            cad1 = nums[i];
            cnt1++;
           }
           else if(cnt2==0)
           {
            cad2 = nums[i];
            cnt2++;
           }
           else{
            cnt1--;
            cnt2--;
           }
        }
        cnt1 =0;
        cnt2 = 0;
        List<Integer> res = new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            if(nums[i]==cad1)
            cnt1++;
            if(nums[i]==cad2)
            cnt2++;
        }
        if(cnt1>n/3) res.add(cad1);
        if(cad1==cad2) return res;
        if(cnt2>n/3) res.add(cad2);
        return res;
        
        
    }
}
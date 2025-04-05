class Solution {
    public static void recursion(int ind,int[] nums,List<List<Integer>> ans,ArrayList<Integer> al)
    {
        ans.add(new ArrayList<>(al));
        for(int i=ind;i<nums.length;i++)
        {
        al.add(nums[i]);
        recursion(i+1,nums,ans,al);
        al.remove(al.size()-1);
        }
    }
    public static int calculate(List<List<Integer>> ans)
    {
        int sum=0;
        for(int i=0;i<ans.size();i++)
        {
            List<Integer> temp=ans.get(i);
            if(temp.size()==1)
            {
                sum=sum+temp.get(0);
            }
            else
            {
                int total=0;
                for(int j=0;j<temp.size();j++)
                {
                    total=total^temp.get(j);
                }
                sum=sum+total;
            }
            
        }
        return sum;
    }
    public int subsetXORSum(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        ArrayList<Integer> al=new ArrayList<>();
        recursion(0,nums,ans,al);
        return calculate(ans);
    }
}
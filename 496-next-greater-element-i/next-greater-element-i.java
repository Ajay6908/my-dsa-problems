class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        int n = nums1.length;
        int ans[] = new int[n];
        int n2 = nums2.length;
        int j = 0;
        boolean flag = false;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n2;i++)
        {
            map.put(nums2[i],i);
        }
        int t = 0;
        for(int i=0;i<n;i++)
        {
            
                j = map.get(nums1[i]);
                flag = false;
                for(int k=j+1;k<n2;k++)
                {
                    

                    if(nums1[i]<nums2[k])
                    {
                        ans[i] = nums2[k];
                        flag = true; 
                        break;
                    }
                }
                    if(!flag)
                    {
                        ans[i] = -1;
                    }
                
            
        }
        return ans;
        
    }
}
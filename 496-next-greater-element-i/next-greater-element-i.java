class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        Stack<Integer> st = new Stack<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n2;i++)
        {
            while(!st.isEmpty()&&st.peek()<nums2[i])
            {
                map.put(st.pop(),nums2[i]);
            }
            st.push(nums2[i]);
        }
        while(!st.isEmpty())
        {
            map.put(st.pop(),-1);
        }
        for(int i=0;i<n1;i++)
        {
            nums1[i] = map.get(nums1[i]);
        }
        return nums1;
        
    }
}
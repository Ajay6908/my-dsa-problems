/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int getDecimalValue(ListNode head) {
        ListNode temp = head;
     
        ListNode prev = null;
        while(temp!=null)
        {
            ListNode tp = temp.next;
            temp.next = prev;
            prev = temp;
            temp = tp;
        }
        
        int num = 0;
        for(int i = 0;prev!=null;i++)
        {
            if(prev.val==1)
            {
                num = num + (int)Math.pow(2,i);
            }
            prev = prev.next;
        }
        return num;

    }
}
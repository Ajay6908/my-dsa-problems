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
    public ListNode deleteMiddle(ListNode head) {
        ListNode temp1=head;
        ListNode temp=head;
        int cnt=0;

        while(temp!=null)
        {
            temp=temp.next;
            cnt++;
        }
        if(cnt==1)
        return null;
        int mid=cnt/2;
        int count=0;
        ListNode prev=temp1;
        while(head!=null)
        {
            if(count == mid)
            prev.next = prev.next.next;
            prev=head;
            head = head.next;
            count++;
        }
        return temp1;

        
    }
}
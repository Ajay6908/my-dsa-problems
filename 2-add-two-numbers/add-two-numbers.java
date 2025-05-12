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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head1 = l1;
        ListNode head2 = l2;
        int carry = 0;
        int sum = 0;
        ListNode extr = new ListNode(-1);
        ListNode ans = extr;
        while(head1!=null||head2!=null)
        {
            sum = carry;
            if(head1!=null)
            sum = sum + head1.val;
            if(head2!=null)
            sum = sum + head2.val;
            ListNode temp = new ListNode(sum%10);
            ans.next = temp;
            ans = temp;
            carry = sum/10;
            if(head1!=null)
            head1=head1.next;
            if(head2!=null)
            head2=head2.next;
        }
        if(carry>0)
        {
            ListNode last = new ListNode(carry);
            ans.next = last;
        }
        return extr.next;
        
    }
}
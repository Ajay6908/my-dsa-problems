public class addtwo {
    static class Node{
        int data;
        Node next;
        Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }
    public static void main(String[] args) {
        
        int arr1[] = {7,8,9};
        int arr2[] = {5,1,9};
        Node head1 = new Node(arr1[0]);
        Node head2 = new Node(arr2[0]);
        Node iter1 = head1;
        Node iter2 = head2;
        for(int i=1;i<arr1.length;i++)
        {
            iter1.next = new Node(arr1[i]);
            iter1 = iter1.next;
        }
        for(int i=1;i<arr2.length;i++)
        {
            iter2.next = new Node(arr2[i]);
            iter2 = iter2.next;
        }
        Node ans = new Node(0);
        int car = 0;
        Node it = ans;
        while(head1!=null||head2!=null||car!=0)
        {
            int sum = (head1==null?0:head1.data) + (head2==null?0:head2.data) + car;
            car = sum/10;
            it.next = new Node(sum%10);
            it = it.next;
            head1 = head1==null?null:head1.next;
            head2 = head2==null?null:head2.next;
        }
        ans = ans.next;
        while(ans!=null)
        {
            System.out.print(ans.data+" ");
            ans = ans.next;
        }

        

        

        
    }
}

class Solution {
    static {
        ListNode t = new ListNode(0);
        for (int i = 0; i < 800; i++)
            deleteMiddle(t);
    }

    static public ListNode deleteMiddle(ListNode head) {
        if(head.next==null) return null;
        ListNode slow=head,fast=head;
        ListNode prev=head;
        while(fast!=null && fast.next!=null){
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        prev.next=prev.next.next;
        return head;
    }
}
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
        l1=reverse(l1);
        l2=reverse(l2);
        ListNode current=new ListNode(-1);
        ListNode result=current;
        int carry=0;
        while(l1!=null || l2!=null || carry!=0){
            int sum=carry;
            if(l1!=null){
                sum+=l1.val;
                l1=l1.next;
            }
            if(l2!=null){
                sum+=l2.val;
                l2=l2.next;
            }
            carry=sum/10;
            result.next=new ListNode(sum%10);
            result=result.next;
        }
        return reverse(current.next);
    }
        private ListNode reverse(ListNode node){
            ListNode curr=node;
            ListNode prev=null;
            ListNode nextr=null;
            while(curr!=null){
                nextr=curr.next;
                curr.next=prev;
                prev=curr;
                curr=nextr;
            }
            return prev;
        }
}
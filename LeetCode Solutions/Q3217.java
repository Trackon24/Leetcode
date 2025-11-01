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
    public ListNode modifiedList(int[] nums, ListNode head) {
        int max=Integer.MIN_VALUE;
        for(int i:nums)max=Math.max(max,i);
        boolean[] present=new boolean[max+1];
        for(int i:nums)present[i]=true;
        ListNode dummy=new ListNode(0);
        ListNode curr=dummy;
        while(head!=null){
            if(head.val>=present.length || present[head.val]==false){
                curr.next=head;
                curr=curr.next;
            }
            head=head.next;
        }
        curr.next=null;
        return dummy.next;
    }
}
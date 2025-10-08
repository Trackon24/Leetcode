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
    public ListNode oddEvenList(ListNode head) {
        int index=1;
        if(head==null)return null;
        ListNode oddHead=null;
        ListNode oddTail=null;
        ListNode evenHead=null;
        ListNode evenTail=null;
        ListNode temp=head;
        while(temp!=null){
            if(index%2!=0){
                if(oddHead==null){
                    oddHead=oddTail=temp;
                }
                else{
                    oddTail.next=temp;
                    oddTail=temp;
                }
            }
            else{
                if(evenHead==null){
                    evenHead=evenTail=temp;
                }
                else{
                    evenTail.next=temp;
                    evenTail=temp;
                }
            }
            temp=temp.next;
            index++;
        }
        if(oddTail!=null)oddTail.next=evenHead;
        if(evenTail!=null)evenTail.next=null;
        return oddHead;
    }
}

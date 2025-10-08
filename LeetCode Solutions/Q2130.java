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
    public int pairSum(ListNode head) {
        int n=0;
        ListNode temp=head;
        while(temp!=null){
            temp=temp.next;
            n++;
        }
        int[] arr=new int[n];
        ListNode curr=head;
        for(int i=0;i<n;i++){
            arr[i]=curr.val;
            curr=curr.next;
        }
        int max=0;
        for(int i=0;i<n/2;i++){
            int sum=arr[i]+arr[n-i-1];
            max=Math.max(sum,max);
        }
        return max;
    }
}
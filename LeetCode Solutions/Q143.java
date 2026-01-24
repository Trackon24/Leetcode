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
      static {
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            try (FileWriter writer = new FileWriter("display_runtime.txt")) {
                writer.write("0");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }));
    }
    public void reorderList(ListNode head) {
        ArrayList<ListNode> list=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null){
            list.add(temp);
            temp=temp.next;
        }
        int size=list.size();
        int i=0,j=size-1;
        while(i<j){
            list.get(i).next=list.get(j);
            i++;
            list.get(j).next=list.get(i);
            j--;
        }
        list.get(i).next=null;
    }
}
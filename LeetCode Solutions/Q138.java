class Solution {
    public Node copyRandomList(Node head) {
        Map<Node, Node> hashMap = new HashMap<>();
        Node temp=head;
        while(temp!=null){
            hashMap.put(temp, new Node(temp.val));
            temp=temp.next;
        }        
        temp=head;
        while(temp!=null){
            Node c=hashMap.get(temp);
            c.next=hashMap.get(temp.next);
            c.random=hashMap.get(temp.random);
            temp=temp.next;
        }
        return hashMap.get(head);
    }
}
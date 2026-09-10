/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head==null){
            return head;
        }
        Node temp=head;
        while(temp!=null){
            Node nxtNode=temp.next;
            Node copyNode=new Node(temp.val);
            temp.next=copyNode;
            copyNode.next=nxtNode;
            temp=nxtNode;
        }
        temp=head;
        while(temp!=null){
            if(temp.random!=null){
                temp.next.random=temp.random.next;
            }
            temp=temp.next.next;
        }
        temp=head;
        Node copy=new Node(0);
        Node dymm=copy;
        while(temp!=null){
            dymm.next=temp.next;
            dymm=dymm.next;
            temp.next=temp.next.next;
            temp=temp.next;

        }
        
        return copy.next;
     
    }
}
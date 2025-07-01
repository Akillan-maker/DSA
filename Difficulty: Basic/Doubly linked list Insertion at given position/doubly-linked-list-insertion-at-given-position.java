/* Structure of Doubly Linked List
class Node
{
    int data;
    Node next;
    Node prev;
    Node(int data)
    {
        this.data = data;
        next = prev = null;
    }
}*/

class Solution {
    // Function to insert a new node at given position in doubly linked list.
    Node addNode(Node head, int p, int x) {
        // Your code here
        if(head==null) return head;
        Node temp=head;
        Node newNode=new Node(x);
        while(temp!=null && p!=0){
            p--;
            temp=temp.next;
        }
        if(temp.next==null){
            temp.next=newNode;
            newNode.prev=temp;
            
            return head;
        }
        newNode.next=temp.next;
        newNode.prev=temp;
        temp.next.prev=newNode;
        temp.next=newNode;
        
        return head;
    }
}
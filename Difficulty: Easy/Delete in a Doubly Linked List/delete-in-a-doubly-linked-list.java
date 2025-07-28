/*

Definition for doubly Link List Node
class Node {
    int data;
    Node next;
    Node prev;

    Node(int val) {
        data = val;
        next = null;
        prev = null;
    }
}
*/
class Solution {
    public Node deleteNode(Node head, int x) {
        // code here
        
       if(head==null) return head;
       
       Node temp=head;
       int count=1;
     
       while(temp != null){
         
           
           
           if(count==x){
               break;
           }
           temp=temp.next;
             count++;
       }
       
        
      Node prev=temp.prev;
      Node front=temp.next;
      if(prev==null && front==null) return head=null;
      else if(prev==null){
          head.next=null;
          front.prev=null;
          head=front;
          return head;
      }
      else if(front==null){
          prev.next=null;
          temp.prev=null;
          return head;
      }
        prev.next=front;
        front.prev=prev;
        temp.next=null;
        temp.prev=null;
      return head;
    
    }
}
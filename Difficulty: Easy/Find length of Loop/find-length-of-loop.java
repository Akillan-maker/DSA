/*
class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}
*/

class Solution {
    // Function to find the length of a loop in the linked list.
    int findLen(Node slow,Node fast){
        int count=1;
        fast=fast.next;
        while(slow!=fast){
            count++;
            fast=fast.next;
        }
        return count;
    }
    public int countNodesinLoop(Node head) {
        // code here.
        Node last=head;
        Node fast=head;
        while(fast != null && fast.next != null){
            last=last.next;
            fast=fast.next.next;
            if(last==fast) return findLen(last,fast);
        }
        return 0;
    }
}
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
    ListNode reverseList(ListNode head) {
        
       ListNode temp=head;
       ListNode prev=null;

       while(temp != null){
        ListNode front=temp.next;
        temp.next=prev;
        prev=temp;
        temp=front;
       }
       return prev;
    }

    public boolean isPalindrome(ListNode head) {
        
       ListNode slow=head;
       ListNode fast=head;
       while(fast.next != null && fast.next.next != null){
        slow=slow.next;
        fast=fast.next.next;
       }
       ListNode newHead=reverseList(slow.next);
       ListNode temp=head;
       while(newHead !=null){
        if(temp.val != newHead.val) return false;
        temp=temp.next;
        newHead=newHead.next;
       }
       reverseList(slow.next);
       return true;
    }
}
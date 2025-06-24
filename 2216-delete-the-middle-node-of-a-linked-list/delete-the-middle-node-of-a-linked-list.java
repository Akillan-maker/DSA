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
    public ListNode deleteMiddle(ListNode head) {
        
       if(head == null || head.next == null) return null;
       ListNode mid=head;
       ListNode last=head.next.next;
       while(last != null && last.next != null){
        mid=mid.next;
        last=last.next.next;
       }
       mid.next=mid.next.next;
       return head;
    }
}
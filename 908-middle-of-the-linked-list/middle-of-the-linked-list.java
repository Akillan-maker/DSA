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
    public ListNode middleNode(ListNode head) {
        
        if(head == null) return head;
       ListNode mid=head;
       ListNode last=head;
       while(last != null && last.next != null){
        mid=mid.next;
        last=last.next.next;
       }
       return mid;
    }
}
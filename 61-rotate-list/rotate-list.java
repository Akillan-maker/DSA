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
    public ListNode rotateRight(ListNode head, int k) {
        
        if(head == null || head.next == null) return head;
        int len=1;
        ListNode temp=head;
        while(temp.next != null){
            len++;
            temp=temp.next;
        }
        int point=k%len;
        int start=(len-point)-1;
        temp.next=head;
        ListNode cur=head;
        while(cur != null && start>0){
            start--;
            cur=cur.next;
        }
        head=cur.next;
        cur.next=null;
        return head;
        }
}
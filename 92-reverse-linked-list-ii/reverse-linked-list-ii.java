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
    ListNode th = null, tt = null;
    public void addFirstNode(ListNode node) {
        if(th == null) 
            th = tt = node;
        else {
            node.next = th;
            th = node;
        }
    }
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head == null || left == right) 
            return head;
        ListNode temp = new ListNode(100);
        temp.next = head;
        ListNode prev = temp;
        for(int i=1; i<left; i++) {
            prev = prev.next;
        }
        ListNode curr = prev.next;
        th = tt = null;
        for(int i = 0; i<right-left+1; i++) {
            ListNode forw = curr.next;
            addFirstNode(curr);
            curr = forw;
        }
        prev.next = th;   
        tt.next = curr;   
        return temp.next;
    }
}
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
        if(k==0 || head==null)
            return head;
        ListNode curr = head;
        int len = 1;
        while(curr.next != null){
            len++;
            curr = curr.next;
        }
        k = k % len;
        curr.next = head;
        ListNode newCurr = head;
        for(int i=0; i<len-k-1; i++){
            newCurr = newCurr.next;
        }
        curr = newCurr.next;
        newCurr.next = null;
        return curr;
    }
}
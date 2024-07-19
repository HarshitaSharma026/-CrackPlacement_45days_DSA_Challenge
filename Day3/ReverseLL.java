//Easy:  https://leetcode.com/problems/reverse-linked-list/description/

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
    public ListNode reverseList(ListNode node) {
        if(node == null || node.next == null) {
            return node;
        }
        ListNode prev = null;
        ListNode curr = node;
        ListNode n = node.next;

        while(curr != null) {
            curr.next = prev;
            prev = curr;
            curr = n;
            if(n != null) {
                n = n.next;
            }
        }
        return prev;
    }
}
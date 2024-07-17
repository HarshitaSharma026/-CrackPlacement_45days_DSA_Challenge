// Easy: https://leetcode.com/problems/remove-duplicates-from-sorted-list/

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
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return head;
        }

        ListNode prev = head;
        ListNode curr = head.next;
        while(curr != null) {
            if (prev.val != curr.val) {
                prev.next = curr;
                prev = prev.next;
                curr = curr.next;
            }
            else {
                curr = curr.next;
            }
            
        }
        prev.next = curr;
        return head;
    }
}

// Time Complexity : O(n)
// Space Complexity : O(1), because linked list itself is part of input. Space complexity typically refers to additional space required by the algorithm aside from the input itself.
//Easy: https://leetcode.com/problems/palindrome-linked-list/description/

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
    public boolean isPalindrome(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        // mid
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        //reverse
        ListNode h2 = reverse(slow);
        ListNode headhalf = h2;
        ListNode h1 = head;
        while(h1 != null && h2 != null) {
            if(h1.val != h2.val) {
                return false;
            }
            h1 = h1.next;
            h2 = h2.next;
        }
        return true;
    }

    public ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        ListNode n = head.next;

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

// Revise again
// Time complexity : O(n)
// Space complexity : O(n)

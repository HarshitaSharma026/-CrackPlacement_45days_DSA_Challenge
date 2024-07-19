// Easy: https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/description/

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
    public int getDecimalValue(ListNode head) {
        ListNode temp = head;
        int length = 0;

        while(temp != null) {
            temp = temp.next;
            length++;
        }
        ListNode curr = head;
        int ans = 0;
        for(int i = length - 1 ; i >= 0; i--) {
            ans += curr.val * Math.pow(2, i);
            curr = curr.next;
        }
        return ans;
    }
}

// Find length of LL
// traverse again to calculate decimal number
// Time complexity: O(n)
// Space complexity: O(1)
// Easy: https://leetcode.com/problems/intersection-of-two-linked-lists/description/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null) {
            return null;
        }
        ListNode temp1 = headA;
        ListNode temp2 = headB;

        //  the loop will run 2 time, 
        // first time if the length is not equal, after pointer of one LL reaches null, we'll start it from head of next LL
        // second time both pointers reached null, we'll end the loop
        while(temp1 != temp2) {
            temp1 = temp1 == null ? headB : temp1.next;
            temp2 = temp2 == null ? headA : temp2.next;
        }
        return temp1;
    }
}

// The loop stops when temp1 == temp2. 
// This happens either at the intersection node or at the end of both lists (null), 
// ensuring the loop runs at most two full lengths of both lists combined.
// Time complexity: O(n), Space Complexity: O(1)
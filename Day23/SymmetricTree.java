// Easy: https://leetcode.com/problems/symmetric-tree/description/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
        // without using extra space
        return isSymmetric(root.left, root.right);
    }
    private boolean isSymmetric(TreeNode node1, TreeNode node2) {
        if(node1 == null && node2 == null) {
            return true;
        }
        if(node1 == null || node2 == null) {
            return false;
        }
        if(node1.val != node2.val) {
            return false;
        }
        boolean left = isSymmetric(node1.left, node2.right);
        boolean right = isSymmetric(node1.right, node2.left);
        return left && right;
    }
}
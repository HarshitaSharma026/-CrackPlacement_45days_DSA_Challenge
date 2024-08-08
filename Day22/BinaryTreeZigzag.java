// Medium: https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/

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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> outer = new ArrayList<>();
        if (root == null) {
            return outer;
        }
        Deque<TreeNode> queue = new LinkedList<>();
        boolean reverse = false;
        queue.offer(root);
        while(!queue.isEmpty()) {
            int level = queue.size();
            List<Integer> inner = new ArrayList<>();
            for (int i = 0; i < level; i++) {
                if(!reverse) {
                    TreeNode curr = queue.pollFirst();
                    inner.add(curr.val);
                    if(curr.left != null) {
                        queue.addLast(curr.left);
                    }
                    if(curr.right != null) {
                        queue.addLast(curr.right);
                    }
                }
                else {
                    TreeNode curr = queue.pollLast();
                    inner.add(curr.val);
                    if(curr.right != null) {
                        queue.addFirst(curr.right);
                    }
                    if(curr.left != null) {
                        queue.addFirst(curr.left);
                    }
                }
            }
            reverse = !reverse;
            outer.add(inner);
        }
        return outer;
    }
}
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
    private int maxSumm = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        gain(root);
        return maxSumm;
    }
    private int gain(TreeNode node){
        if(node == null){
            return 0;
        }
        //Ignoring the negative nodes
        int leftGain = Math.max(0 ,gain(node.left));
        int rightGain = Math.max(0 ,gain(node.right));
        int currentPath = leftGain + node.val + rightGain;
        //updating the maximumSum
        maxSumm = Math.max(maxSumm , currentPath);
        //choosing the longest subtree height to parent
        return node.val + Math.max(leftGain , rightGain);
    }
}
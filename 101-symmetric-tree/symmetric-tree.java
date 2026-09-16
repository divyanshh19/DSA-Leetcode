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
        if(root == null){
            return true;
        }
        return mirror(root.left , root.right);
    }
    private boolean mirror(TreeNode left , TreeNode right){
        //if any one is null
        if(left == null || right == null){
            return left == right;
        }
        //preorder traversal root -> left -> right compare with reverse of preorder root -> right -> left
        if(left.val != right.val){
            return false;
        }
        //checking mirror positions
        return mirror(left.left ,right.right) && mirror(left.right, right.left);
    }
}
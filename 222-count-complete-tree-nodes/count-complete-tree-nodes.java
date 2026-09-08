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
    public int countNodes(TreeNode root) {
        if(root == null){
            return 0;
        }
        int leftNode = leftCount(root);
        int rightNode = rightCount(root);
        if(leftNode == rightNode){      //for perfect BT
            return (1 << leftNode) - 1;   //left shift 2^leftNode - 1
        }
        return 1 + countNodes(root.left) + countNodes(root.right);    //if not perfect Binary Tree
    }
    public int leftCount(TreeNode root){
        int count = 0;
        while(root != null){
            count++;
            root = root.left;
        }
        return count;
    }
    public int rightCount(TreeNode root){
        int count = 0;
        while(root != null){
            count++;
            root = root.right;
        }
        return count;
    }
}
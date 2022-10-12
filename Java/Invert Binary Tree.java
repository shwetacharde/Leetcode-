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
    public TreeNode invertTree(TreeNode root) {
        invert(root);
        return root;
    }
    public static void invert(TreeNode root){
        if(root==null) return;
        TreeNode val=root.left;
        root.left=root.right;
        root.right=val;
        invert(root.left);
        invert(root.right);
    }
}

// Question Link: https://leetcode.com/problems/invert-binary-tree/
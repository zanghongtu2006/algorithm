package com.hongtu.leetcode.easy.maxdeptofbinarytree;

/**
 * Created by hongtu on 16-10-21.
 * Given a binary tree, find its maximum depth.

 * The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
 */
public class MaximumDepthOfBinaryTree {
    public int maxDepth(TreeNode root) {
        int depth = 0;
        if(root == null) {
            return depth;
        }
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);
        depth = (leftDepth > rightDepth) ? leftDepth + 1: rightDepth + 1;
        return depth;
    }

    public static void main(String[] args) {
        MaximumDepthOfBinaryTree maximumDepthOfBinaryTree = new MaximumDepthOfBinaryTree();
        System.out.println(maximumDepthOfBinaryTree.maxDepth(new TreeNode(1)));
    }
}

package org.zubov.solutions.easy;

import static org.zubov.solutions.easy.MaximumDepthOfBinaryTree.*;

public class InvertBinaryTree {
    public static TreeNode invertTree(TreeNode root) {

        if (root == null) {
            return null;
        }
        TreeNode node = root.left;
        root.left = root.right;
        root.right = node;
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }
}

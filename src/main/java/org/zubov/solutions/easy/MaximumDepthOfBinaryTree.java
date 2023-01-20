package org.zubov.solutions.easy;

import java.util.Objects;

public class MaximumDepthOfBinaryTree {
    public static int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return recursion(root.left, root.right) + 1;

    }

    private static int recursion(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return 0;
        } else if (left == null) {
            return recursion(right.left, right.right) + 1;
        } else if (right == null) {
            return recursion(left.left, left.right) + 1;
        } else {
            return Math.max(recursion(right.left, right.right), recursion(left.left, left.right)) + 1;
        }
    }


    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            TreeNode treeNode = (TreeNode) o;
            return val == treeNode.val && Objects.equals(left, treeNode.left) && Objects.equals(right, treeNode.right);
        }

        @Override
        public int hashCode() {
            return Objects.hash(val, left, right);
        }
    }
}

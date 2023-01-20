package org.zubov.solutions.easy;

import org.junit.jupiter.api.Test;
import org.zubov.solutions.easy.MaximumDepthOfBinaryTree.TreeNode;

import static org.junit.jupiter.api.Assertions.*;

class InvertBinaryTreeTest {
    @Test
    void testCaseOne() {
        //Given
        TreeNode root = new TreeNode(4, new TreeNode(2, new TreeNode(1, null, null), new TreeNode(3, null, null))
                , new TreeNode(7, new TreeNode(6, null, null), new TreeNode(9, null, null)));
        //Then
        TreeNode result = InvertBinaryTree.invertTree(root);

        //When
        assertEquals(new TreeNode(4, new TreeNode(7, new TreeNode(9, null, null), new TreeNode(6, null, null))
                        , new TreeNode(2, new TreeNode(3, null, null), new TreeNode(1, null, null)))
                , result);
    }

    @Test
    void testCaseTwo() {
        //Given
        TreeNode root = new TreeNode(1, new TreeNode(2, null, null)
                , new TreeNode(3, null, null));
        //Then
        TreeNode result = InvertBinaryTree.invertTree(root);

        //When
        assertEquals(new TreeNode(1, new TreeNode(3, null, null), new TreeNode(2, null, null))
                , result);
    }

}
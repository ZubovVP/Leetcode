package org.zubov.solutions.easy;

import org.junit.jupiter.api.Test;
import org.zubov.solutions.easy.MaximumDepthOfBinaryTree.TreeNode;

import static org.junit.jupiter.api.Assertions.*;

class MaximumDepthOfBinaryTreeTest {

    @Test
    void testCaseOne() {
        //Given
        TreeNode root = new TreeNode(3, new TreeNode(9, null, null)
                , new TreeNode(20, new TreeNode(15, null, null)
                , new TreeNode(7, null, null)));
        //Then
        int result = MaximumDepthOfBinaryTree.maxDepth(root);

        //When
        assertEquals(3, result);
    }

    @Test
    void testCaseTwo() {
        //Given
        TreeNode root = new TreeNode(1, null
                , new TreeNode(2, null, null));
        //Then
        int result = MaximumDepthOfBinaryTree.maxDepth(root);

        //When
        assertEquals(2, result);
    }

}
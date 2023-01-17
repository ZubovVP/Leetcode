package org.zubov.solutions.easy;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.zubov.solutions.easy.MergeTwoSortedLists.*;

class MergeTwoSortedListsTest {

    @Test
    void testCaseOne() {
        //Given
        ListNode list1 = new ListNode(1
                , new ListNode(2
                , new ListNode(4)));

        ListNode list2 = new ListNode(1
                , new ListNode(3
                , new ListNode(4)));

        ListNode expected = new ListNode(1
                , new ListNode(1
                , new ListNode(2
                , new ListNode(3
                , new ListNode(4
                , new ListNode(4))))));
        //Then
        ListNode result = mergeTwoLists(list1, list2);

        //When
        assertEquals(expected, result);
    }

    @Test
    void testCaseTwo() {
        //Given
        ListNode list1 = new ListNode();

        ListNode list2 = new ListNode();

        ListNode expected = new ListNode(0, new ListNode(0));
        //Then
        ListNode result = mergeTwoLists(list1, list2);

        //When
        assertEquals(expected, result);
    }
}
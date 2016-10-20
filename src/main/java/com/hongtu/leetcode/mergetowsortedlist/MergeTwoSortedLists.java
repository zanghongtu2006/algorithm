package com.hongtu.leetcode.mergetowsortedlist;

/**
 * Created by hongtu on 16-10-20.
 * Merge two sorted linked lists and return it as a new list.
 * The new list should be made by splicing together the nodes of the first two lists.
 */
public class MergeTwoSortedLists {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        System.out.println(l1 + ", " + l2);
        if (l1 == null && l2 == null) {
            return null;
        } else if (l1 != null && l2 == null) {
            return l1;
        } else if (l1 == null && l2 != null) {
            return l2;
        }
        ListNode result = null;
        ListNode tag = null;
        if (l1.val < l2.val) {
            result = new ListNode(l1.val);
            tag = new ListNode(l1.val);
            l1 = l1.next;
        } else {
            result = new ListNode(l2.val);
            tag = new ListNode(l2.val);
            l2 = l2.next;
        }
        while (l1 != null && l2 != null) {
            ListNode node = null;
            if (l1.val < l2.val) {
                node = new ListNode(l1.val);
                l1 = l1.next;
            } else {
                node = new ListNode(l2.val);
                l2 = l2.next;
            }
            if(result.next == null) {
                result.next = node;
            }
            tag.next = node;
            tag = node;
        }
        System.out.println(tag + ", " + l1 + ", " + l2 + ", " + result);
        if (l1 != null) {
            tag.next = l1;
            tag = l1;
            if(result.next == null) {
                result.next = l1;
            }
        } else if (l2 != null) {
            tag.next = l2;
            tag = l1;
            if(result.next == null) {
                result.next = l2;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        MergeTwoSortedLists mergeTwoSortedLists = new MergeTwoSortedLists();
        ListNode l1 = new ListNode(5);
        ListNode l2 = new ListNode(1);
        ListNode l22 = new ListNode(2);
        l2.next = l22;
        ListNode l2Tag = l22;
        ListNode l23 = new ListNode(4);
        l2Tag.next = l23;
        System.out.println(mergeTwoSortedLists.mergeTwoLists(l1, l2));
    }
}

package com.hongtu.algorithm.recursive;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by hongtu_zang on 2016/8/26.
 */
public class TestBinarySearch {
    private static final int[] a = {1, 2 ,3, 5, 6};
    private static final BinarySearch bs = new BinarySearch(a);

    @Test
    public void testSearch() {
        int result = bs.search(3);
        assertEquals("equals", 2, result);
        result = bs.search(7);
        assertEquals("equals", -1, result);
        result = bs.search(4);
        assertEquals("equals", -1, result);
    }

    @Test
    public void testRecSearch() {
        int result = bs.recSearch(3, 0, a.length - 1);
        assertEquals("equals", 2, result);
        result = bs.recSearch(7, 0, a.length - 1);
        assertEquals("equals", -1, result);
        result = bs.recSearch(4, 0, a.length - 1);
        assertEquals("equals", -1, result);
    }
}

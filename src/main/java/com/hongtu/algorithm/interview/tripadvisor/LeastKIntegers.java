package com.hongtu.algorithm.interview.tripadvisor;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by hongtu on 16-10-31.
 * find the least K integers from N.
 */
public class LeastKIntegers {
    public static void main(String[] args) {
        int[] n = {34, 56, 6, 7, 2, 98, 35, 22};
        int k = 4;
        int[] result = findLeastK(n, k);
        for (int i = 0; i < k; i++) {
            System.out.print(result[i] + ", ");
        }
    }

    /**
     * TreeSet will sort when insert.
     * Use Binary Tree
     * @param n
     * @param k
     * @return
     */
    private static int[] findLeastK(int[] n, int k) {
        int[] result = new int[k];
        Set<Integer> set = new TreeSet<Integer>();
        for (int i = 0; i < n.length; i++) {
            set.add(new Integer(n[i]));
        }
        Integer[] array = set.toArray(new Integer[k]);
        for (int i = 0; i < k; i++) {
            result[i] = array[i];
        }
        return result;
    }
}

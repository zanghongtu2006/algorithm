package com.hongtu.leetcode.easy;

/**
 * Created by hongtu on 17-5-22.
 */
public class FindComplete {

    private static int findComplement(int num) {
        int reg = 1;
        while ((num & reg) != num) {
            reg = (reg << 1) + 1;
        }
        return (~num) & reg;
    }

    public static void main(String[] args) {
        System.out.println(findComplement(5));
    }
}

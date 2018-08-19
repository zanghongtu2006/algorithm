package com.hongtu.leetcode.easy;

/**
 * Created by hongtu on 17-5-23.
 */
public class TotalHammingDistance {

    private static int hammingDistance(int x, int y) {
        int val = x ^ y;
        int num = 0;
        while (val > 0) {
            if ((val & 1) == 1) {
                num ++;
            }
            val = val >> 1;
        }
        return num;
    }

    private static int totalHammingDistance(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                result += hammingDistance(nums[i], nums[j]);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {4, 14, 2};
        long t1 = System.nanoTime();
        System.out.println(totalHammingDistance(nums));
        long t2 = System.nanoTime();
        System.out.println("function time: " + (t2 - t1));
    }
}

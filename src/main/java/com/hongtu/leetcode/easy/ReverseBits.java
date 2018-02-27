package com.hongtu.leetcode.easy;

/**
 * Created by hongtu on 17-5-22.
 */
public class ReverseBits {

    private static int reverseBits(int n) {
        int result = 0;
        for(int i = 0; i < 32; i++) {
            result = result << 1;
            result += (n & 1);
            n = n >> 1;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(reverseBits(43261596));
    }
}

package com.hongtu.leetcode;

/**
 * Created by hongtu on 16-10-21.
 */
public class PowerOfTwo {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }
        return (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {
        PowerOfTwo powerOfTwo = new PowerOfTwo();
        System.out.println(powerOfTwo.isPowerOfTwo(6));
    }
}

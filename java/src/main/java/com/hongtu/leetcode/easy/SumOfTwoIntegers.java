package com.hongtu.leetcode.easy;

/**
 * Created by hongtu on 16-10-21.
 * Calculate the sum of two integers a and b, but you are not allowed to use the operator + and -.
 * Example:
 * Given a = 1 and b = 2, return 3.
 */
public class SumOfTwoIntegers {
    public int getSum(int a, int b) {
        if(b == 0) {
            return a;
        }
        return getSum((a^b), ((a&b) << 1));
    }

    public static void main(String[] args) {
        SumOfTwoIntegers sumOfTwoIntegers = new SumOfTwoIntegers();
        System.out.println(sumOfTwoIntegers.getSum(1, 2));
    }
}

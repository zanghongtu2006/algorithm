package com.hongtu.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hongtu on 16-10-16.
 * Reverse digits of an integer.
 * Example1: x = 123, return 321
 * Example2: x = -123, return -321
 */
public class ReverseInteger {

    public int reverse(int x) {
        List<Integer> list = new ArrayList<Integer>();
        Boolean negative = false;
        //make x to be a positive number
        if(x < 0) {
            negative = true;
            x *= -1;
        }
        if(x < 0 ) { //if x still a negative number, return 0
            return 0;
        }
        //parse number into a list
        int result = 0;
        while (x >= 10) {
            int tmp = x % 10;
            result = (result * 10) + tmp;
            if (result > (Integer.MAX_VALUE/10)) {
                //if result will overflow, retun 0
                return 0;
            }
            x = x / 10;
        }
        result = (result * 10) + x;
        return result * (negative?-1:1);
    }

    public static void main(String[] args) {
        ReverseInteger reverseInteger = new ReverseInteger();
        System.out.println(reverseInteger.reverse(123234324));
    }
}
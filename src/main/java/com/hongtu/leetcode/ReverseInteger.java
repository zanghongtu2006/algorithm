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
        while (x >= 10) {
            list.add(x % 10);
            x = x / 10;
        }
        list.add(x);
        Integer result = 0;
        for(int i = 0; i < list.size(); i++) {
            result = (result * 10) + list.get(i);
            if (result > (Integer.MAX_VALUE/10) && i < (list.size() - 1)) {
                //if result will overflow, retun 0
                return 0;
            }
        }
        return result * (negative?-1:1);
    }

    public static void main(String[] args) {
        ReverseInteger reverseInteger = new ReverseInteger();
        System.out.print(reverseInteger.reverse(-2147483648));
    }
}
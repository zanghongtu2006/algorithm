package com.hongtu.algrithm.recursive;

/**
 * Created by hongtu_zang on 2016/8/26.
 */
public class Factorial {
    long factorial(long n) {
        if( n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}

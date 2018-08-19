package com.hongtu.algorithm.recursive;

/**
 * Created by hongtu_zang on 2016/8/26.
 *
 * 三角函数求和
 */
public class Triangle {
    int triangle(int n) {
        if(n == 1) {
            return 1;
        } else {
            return n + triangle(n - 1);
        }
    }
}

package com.hongtu.algorithm.sort.common;

/**
 * Created by lenovo on 2016/9/10.
 */
public class RandomArray {

    public static int[] random(int min, int max, int count) {
        int[] array = new int[count];
        for(int i = 0; i < count; i++) {
            array[i] = (int)(min + Math.random()*(max));
        }
        return array;
    }
}

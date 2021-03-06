package com.hongtu.algorithm.sort;

import com.hongtu.algorithm.sort.common.RandomArray;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by hongtu_zang on 2016/9/1.
 */
public class BubbleSort {
    private static int[] array;

    /**
     * 正向排序，从小到大
     */
    public static void sort() {
        for(int i = array.length - 1; i >= 0; i--) {
            for(int j = i; j < array.length - 1; j++) {
                if(array[j] > array[j + 1]) {
                    exchange(j);
                }
            }
        }
        printArray();
    }

    /**
     * 逆向排序，从大到小
     */
    public static void reverseSort() {
        for(int i = 1; i < array.length; i++) {
            for(int j = i; j > 0; j--) {
                if(array[j] > array[j - 1]) {
                    exchange(j - 1);
                }
            }
        }
        printArray();
    }

    private static void printArray() {
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ",");
        }
        System.out.print('\n');
    }

    private static void exchange(int i) {
        int tmp = array[i];
        array[i] = array[i + 1];
        array[i + 1] = tmp;
    }

    public static void main(String[] args) {
        array = RandomArray.random(1, 100, 10);
        printArray();
        sort();
    }

}

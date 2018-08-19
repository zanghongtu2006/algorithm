package com.hongtu.algorithm.sort;

import com.hongtu.algorithm.sort.common.RandomArray;

/**
 * Created by lenovo on 2016/9/8.
 *
 * 遍历数组，保持前n位有序，一直到n=length
 */
public class SelectSort {
    private static int[] array;

    /**
     * 正向排序，从小到大
     */
    public static void sort() {
        for(int i = 0; i < array.length; i++) {
            int min = i;
            for (int j = i; j < array.length; j++) {
                if(array[j] < array[min]) {
                    min = j;
                }
            }
            if(i != min) {
                exchange(i, min);
            }
        }
        printArray();
    }

    /**
     * 逆向排序，从大到小
     */
    public static void reverseSort() {
        for(int i = 0; i < array.length; i++) {
            int max = i;
            for(int j = i; j < array.length; j++) {
                if(array[j] > array[max]) {
                    max = j;
                }
            }
            if( i != max) {
                exchange(i, max);
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

    private static void exchange(int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }

    public static void main(String[] args) {
        array = RandomArray.random(1, 100, 10);
        printArray();
        sort();
    }
}

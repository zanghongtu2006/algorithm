package com.hongtu.algorithm.sort;

import com.hongtu.algorithm.sort.common.RandomArray;

/**
 * Created by lenovo on 2016/9/10.
 *
 * 遍历数组，默认前n位有序，将第n+1位插入到前面有序队列中
 */
public class InsertSort {
    private static int[] array;

    /**
     * 正向排序，从小到大
     */
    public static void sort() {
        for(int i = 1; i < array.length; i++) {
            if(array[i] < array[i - 1]) {
                insert(i);
            }
        }
        printArray();
    }

    private static void insert(int tag) {
        int tmp = array[tag];
        int i = tag;
        for(; i > 0; i--) {
            if(tmp < array[i - 1]) {
                array[i] = array[i - 1];
            } else {
                break;
            }
        }
        array[i] = tmp;
    }

    /**
     * 逆向排序，从大到小
     */
    public static void reverseSort() {
        for (int i = 1; i < array.length; i++) {
            if(array[i] > array[i - 1]) {
                reverseInert(i);
            }
        }
        printArray();
    }

    private static void reverseInert(int tag) {
        int tmp = array[tag];
        int i = tag;
        for(; i > 0; i--) {
            if(tmp > array[i - 1]) {
                array[i] = array[i - 1];
            } else {
                break;
            }
        }
        array[i] = tmp;
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
        reverseSort();
    }


}

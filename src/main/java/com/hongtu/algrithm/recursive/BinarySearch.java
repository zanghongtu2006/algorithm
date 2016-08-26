package com.hongtu.algrithm.recursive;

/**
 * Created by hongtu_zang on 2016/8/26.
 */
public class BinarySearch {
    private int[] a;

    public BinarySearch(int[] a) {
        this.a = a;
    }

    public int search(int key) {
        int lowerBond = 0;
        int upperBond = a.length - 1;
        int cur;
        while(true) {
            cur = (lowerBond + upperBond) / 2;
            if( a[cur] == key) {
                return cur;
            } else if(lowerBond > upperBond) {
                return -1;
            } else {
                if(key < a[cur]) {
                    upperBond = cur - 1;
                } else {
                    lowerBond = cur + 1;
                }
            }
        }
    }

    public int recSearch(int key, int lowerBond, int upperBond) {
        int cur = (lowerBond + upperBond) / 2;
        if(a[cur] == key) {
            return cur;
        } else if(lowerBond > upperBond) {
            return -1;
        } else if(key < a[cur]) {
            return recSearch(key, lowerBond, cur - 1);
        } else {
            return recSearch(key, cur + 1, upperBond);
        }
    }
}

package com.hongtu.leetcode.easy;

/**
 * Created by hongtu on 17-5-21.
 *
 */
public class HammingWeight {
    private static int hammingWeight(int n) {
        int num = 0;
        while ( n > 0) {
            if ((n & 1) == 1) {
                num ++;
            }
            n = n >> 1;
        }
        return num;
    }

    private static int hammingWeight2(int n) {
        int num = 0;
        for (int i=0; i < 32 && n > 0; i++) {
            num += (n >>> i) & 1;
        }
        return num;
    }

    private static int hammingWeight4(int n) {
        n = n - ((n >>> 1) & 0x55555555);
        n = (n & 0x33333333) + ((n >>> 2) & 0x33333333);
        n = (n + (n >>> 4)) & 0x0f0f0f0f;
        n = n + (n >>> 8);
        n = n + (n >>> 16);
        return n & 0x3f;
    }

    private static int hammingWeight3(int n) {
        int count =0;
        int shift =0;
        while(shift < 32){
            if((n & (0x1<<shift))!=0)
                count++;
            shift++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(hammingWeight3(2));
    }
}

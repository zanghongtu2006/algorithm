package com.hongtu.leetcode.easy;

/**
 * Created by hongtu on 17-5-21.
 */
public class HammingDistance {
    /**
     * 最多循环32次，每次循环中3次按位与运算。
        每次循环中
        （1）先取val为1左移n位，n为0~31区间取值，val与当前x和y分别做按位与运算
        （2）如果val值大于x和y，则说明已经没有可比较的值，跳出循环即可
        （3）按位与运算结果为x和y第i位是否为1，如果x和y当前位不相等，则最终结果num+1
     * @param x
     * @param y
     * @return
     */
    private static int hammingDistance(int x, int y) {
        int num = 0;
        for (int i = 0; i < 32; i++) {
            int val = 1 << i;
            if (val > x && val > y) {
                break;
            }
            if ((x & val) != (y & val)) {
                num ++;
            }
        }
        return num;
    }

    /**
     * x和y做按位与运算，得到的值右移直到0，统计1的个数。
       一次按位与运算，每次循环中一次按位与运算
     * @param x
     * @param y
     * @return
     */
    private static int hammingDistance2(int x, int y) {
        int val = x ^ y;
        int num = 0;
        while (val > 0) {
            if ((val & 1) == 1) {
                num ++;
            }
            val = val >> 1;
        }
        return num;
    }

    public static void main(String[] args) {
        long t1 = System.nanoTime();
        System.out.println(hammingDistance(1, 4));
        long t2 = System.nanoTime();
        System.out.println(hammingDistance2(1, 4));
        long t3 = System.nanoTime();
        System.out.println(t2-t1);
        System.out.println(t3-t2);
    }
}

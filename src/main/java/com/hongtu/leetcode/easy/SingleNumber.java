package com.hongtu.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hongtu on 16-10-19.
 * Given an array of integers, every element appears twice except for one.
 * Find that single one.
 * Note:
 * Your algorithm should have a linear runtime complexity.
 * Could you implement it without using extra memory?
 */
public class SingleNumber {

    //LTE
    public int singleNumber(int[] nums) {
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < nums.length; i++) {
            if(list.contains(nums[i])) {
                list.remove(new Integer(nums[i]));
            } else {
                list.add(nums[i]);
            }
        }
        return list.get(0);
    }

    //LTE
    public int singleNumber3(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int j = 0;
            for (; j < nums.length; j++) {
                if (i == j) {
                    continue;
                }
                if (nums[i] == nums[j]) {
                    break;
                }
            }
            if (j == nums.length) {
                return nums[i];
            }
        }
        return nums[nums.length - 1];
    }

    //LTE
    public int singleNumber2(int[] nums) {
        if (nums.length == 0) {
            return 0;
        } else if (nums.length <= 1) {
            return nums[0];
        }
        for(int i = 0; i < nums.length; i++) {
            int min = i;
            for (int j = i; j < nums.length; j++) {
                if(nums[j] < nums[min]) {
                    min = j;
                }
            }
            if(i != min) {
                int tmp = nums[i];
                nums[i] = nums[min];
                nums[min] = tmp;
            }
        }
        for (int i = 0; i < nums.length; ) {
            if (i == nums.length - 1) {
                return nums[i];
            }
            if (nums[i] == nums[i + 1]) {
                i = i + 2;
                continue;
            } else {
                return nums[i];
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        SingleNumber singleNumber = new SingleNumber();
        System.out.println(singleNumber.singleNumber(new int[]{1, 0, 1}));
    }
}

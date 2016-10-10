package com.hongtu.leetcode;

import java.util.Arrays;

/**
 * Created by hongtu on 2016/10/10.
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * You may assume that each input would have exactly one solution.
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] nums = {2,1,9,4,4,56,90,3};
        int target = 8;
        TwoSum twoSum = new TwoSum();
        int[] result = twoSum.twoSum(nums, target);
        if(result == null) {
            System.out.println(result);
        } else {
            System.out.print("[");
            for(int i = 0; i < result.length; i++) {
                System.out.print(result[i]);
                if(i < result.length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.print("]\n");
        }
    }
}

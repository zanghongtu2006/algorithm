package com.hongtu.leetcode;

/**
 * Created by hongtu on 2016/10/10.
 * Given an array of integers that is
 *      already sorted in ascending order,
 * find two numbers such that they add up to a specific target number.
 * The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2.
 * Please note that your returned answers (both index1 and index2) are not zero-based.
 * You may assume that each input would have exactly one solution.
 */
public class TwoSumII {
    public int[] twoSum(int[] numbers, int target) {
        for(int i = 0; i < numbers.length; i++) {
            for(int j = i + 1; j < numbers.length; j++) {
                int sum = numbers[i] + numbers[j];
                if(sum == target) {
                    return new int[]{i + 1, j + 1};
                } else if(sum > target) {
                    return new int[]{-1, -1};
                }
            }
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        TwoSumII twoSum = new TwoSumII();
        int[] result = twoSum.twoSum(nums, target);
        if(result == null) {
            System.out.println(result);
        } else {
            System.out.println("index1=" + result[0] + ", index2=" + result[1]);
        }
    }
}

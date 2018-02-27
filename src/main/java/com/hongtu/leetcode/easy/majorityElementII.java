package com.hongtu.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hongtu on 17-5-24.
 *
 */
public class majorityElementII {

    private static List<Integer> majorityElement(int[] nums) {
        int candidate1 = 0;
        int candidate2 = 1;
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == candidate1) {
                count1 ++;
            } else if (nums[i] == candidate2) {
                count2 ++;
            } else {
                if (count1 == 0) {
                    candidate1 = nums[i];
                    count1++;
                } else if (count2 == 0) {
                    candidate2 = nums[i];
                    count2++;
                } else {
                    count1--;
                    count2--;
                }
            }
        }
        List<Integer> result = new ArrayList<Integer>();
        if (count1 > 0) {
            int count = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == candidate1) {
                    count++;
                }
            }
            if (count > nums.length/3) {
                result.add(candidate1);
            }
        }
        if (count2 > 0) {
            int count = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == candidate2) {
                    count ++;
                }
            }
            if (count > nums.length/3) {
                result.add(candidate2);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {0,3,4,0};
        System.out.println(majorityElement(nums));
    }
}

package com.hongtu.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hongtu on 17-5-24.
 */
public class RemoveDuplicates {
    private static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        List<Integer> result = new ArrayList<Integer>();
        int tmp = 1;//dangeshuzigeshu
        int num = nums[0];
        result.add(num);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == num) {
                tmp++;
                if (tmp > 2) {
                    continue;
                } else {
                    result.add(nums[i]);
                }
            } else {
                result.add(nums[i]);
                num = nums[i];
                tmp = 1;
            }
        }
        nums = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            nums[i] = result.get(i);
        }
        return result.size();
    }

    public static void main(String[] args) {
        int[] nums = {1,1,1,2};
        System.out.println(removeDuplicates(nums));
    }
}

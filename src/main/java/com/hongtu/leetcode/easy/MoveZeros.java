package com.hongtu.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hongtu on 17-5-28.
 *
 */
public class MoveZeros {
    public void moveZeroes(int[] nums) {
        List<Integer> lists = new ArrayList<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                lists.add(i);
            }
        }
        int step = 1, end = 0;
        for (int index = 0; index < lists.size(); index++) {
            for (int i = lists.get(index); i < lists.get(index+1); i++) {
                nums[i] = nums[i+step];
                end = i + 1;
            }
            step++;
        }
        for (; end < nums.length; end++) {
            nums[end] = 0;
        }
    }


}

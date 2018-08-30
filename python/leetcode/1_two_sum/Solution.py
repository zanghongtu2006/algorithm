#!/usr/bin/env python
# -*- coding: utf-8 -*-

"""

@author: Hongtu Zang

@contact: zanghongtu2006@gmail.com

@file: Solution.py

@time: 8/20/18 12:37 AM

@desc:

"""


class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        for i in range(0, len(nums)):
            for j in range(1, len(nums)):
                if i == j:
                    continue
                if nums[i] + nums[j] == target:
                    return i, j

    def twoSum2(self, nums, target):
        lst = []
        for i in range(0, len(nums)):
            lst[i] = target - nums[i]
        for i in range(0, len(nums)):
            if lst[i] == 0:
                return i


if __name__ == "__main__":
    solution = Solution()
    nums = [1, 2, 3]
    target = 5
    print(solution.twoSum(nums, target))

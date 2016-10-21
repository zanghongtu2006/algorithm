package com.hongtu.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by hongtu on 16-10-21.
 *
 * Given two strings s and t which consist of only lowercase letters.
 * String t is generated by random shuffling string s and then add one more letter at a random position.
 * Find the letter that was added in t.

 * Example:

 * Input:
 * s = "abcd"
 * t = "abcde"
 * Output:
 * e
 * Explanation:
 * 'e' is the letter that was added.
 */
public class FindTheDifference {
    public char findTheDifference(String s, String t) {
        List<Character> sList = new ArrayList<Character>();
        for (char c : s.toCharArray()) {
            sList.add(c);
        }
        List<Character> tList = new ArrayList<Character>();
        for (char c : t.toCharArray()) {
            tList.add(c);
        }
        for (char c : sList) {
            if (tList.contains(c)) {
                tList.remove(new Character(c));
            } else {
                return c;
            }
        }
        return tList.get(0);
    }

    public static void main(String[] args) {
        FindTheDifference findTheDifference = new FindTheDifference();
        System.out.println(findTheDifference.findTheDifference("abcd", "abcde"));
    }
}

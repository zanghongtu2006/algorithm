package com.hongtu.leetcode.easy;

/**
 * Created by hongtu on 16-10-18.
 */
public class ReverseString {
    public String reverseString(String s) {
        char[] array = new char[s.length()];
        for(int i = 0; i < s.length(); i++) {
            array[s.length() - 1 - i] = s.charAt(i);
        }
        return String.copyValueOf(array);
    }

    public static void main(String[] args) {
        ReverseString reverseString = new ReverseString();
        System.out.println(reverseString.reverseString("hello"));
    }
}

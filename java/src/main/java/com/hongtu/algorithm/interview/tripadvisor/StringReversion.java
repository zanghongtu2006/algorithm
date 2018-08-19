package com.hongtu.algorithm.interview.tripadvisor;

/**
 * Created by hongtu on 16-10-31.
 * reverse a string,
 * if you can do it with recursive, it is a big bonus point
 */
public class StringReversion {
    public static void main(String[] args) {
        String origin = "abcd";
        System.out.println(reverse1(origin));
        System.out.println(reverse2(origin));
    }

    private static String reverse1(String origin) {
        char[] chars = new char[origin.length()];
        for (int i = 0; i < origin.length(); i++) {
            chars[i] = origin.charAt(origin.length() - i - 1);
        }
        return new String(chars);
    }

    private static String reverse2(String origin) {
        if (origin.length() == 1) {
            return origin;
        }
        String dest = origin.charAt(origin.length() - 1) + reverse2(origin.substring(0, origin.length() - 1));
        return dest;
    }
}

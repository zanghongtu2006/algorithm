package com.hongtu.leetcode.easy;

/**
 * Created by hongtu on 16-10-17.
 * Implement atoi to convert a string to an integer.

 * Hint: Carefully consider all possible input cases.
 * If you want a challenge, please do not see below and ask yourself what are the possible input cases.

 * Notes: It is intended for this problem to be specified vaguely (ie, no given input specs).
 * You are responsible to gather all the input requirements up front.
 *
 * NEED TO THINK ALL POSSIBLE INPUI CASES
 */
public class String2Integer {
    public int atoi(String str) {
        if(str.length() == 0) {
            return 0;
        }
        long result = 0;
        int negative = 1;
        boolean beginNumber = false;
        for(int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(!beginNumber && c == 32) {
                continue;
            } else if(!beginNumber && c == 43) {
                beginNumber = true;
            } else if(!beginNumber && c == 45) {
                beginNumber = true;
                negative = -1;
            } else if( c > 47 && c < 58) {
                beginNumber = true;
                result = (result * 10) + (c - 48);
                if(negative == 1 && result > 2147483647) {
                    return Integer.MAX_VALUE;
                } else if(negative == -1 && result > 2147483648L) {
                    return Integer.MIN_VALUE;
                }
            } else {
                return (int)result * negative;
            }

        }
        return (int)result * negative;
    }

    public static void main(String[] args) {
        String2Integer string2Integer = new String2Integer();
//        System.out.println(string2Integer.atoi("    010"));
//        System.out.println(string2Integer.atoi("+-2"));
//        System.out.println(string2Integer.atoi("  -0012a42"));
//        System.out.println(string2Integer.atoi("2147483648"));
//        System.out.println(string2Integer.atoi("-2147483647"));
//        System.out.println(string2Integer.atoi("      -11919730356x"));
        System.out.println(string2Integer.atoi("    10522545459"));
    }
}

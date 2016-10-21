package com.hongtu.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hongtu on 16-10-18.
 *
 * Determine whether an integer is a palindrome.
 * Do this without extra space.
 */
public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        int origin = x;
        List<Integer> list = new ArrayList<Integer>();
        if( x < 0) {
            return false;
        }
        int result = 0;
        while (x >= 10) {
            int tmp = x % 10;
            result = (result * 10) + tmp;
            if (result > (Integer.MAX_VALUE/10)) {
                //if result will overflow, retun 0;
                return false;
            }
            x = x / 10;
        }
        result = (result * 10) + x;
        return result == origin;
    }

    public static void main(String[] args) {
        PalindromeNumber palindromeNumber = new PalindromeNumber();
//        System.out.println(palindromeNumber.isPalindrome(13231));
//        System.out.println(palindromeNumber.isPalindrome(132231));
//        System.out.println(palindromeNumber.isPalindrome(-132231));
//        System.out.println(palindromeNumber.isPalindrome(132331));
        System.out.println(palindromeNumber.isPalindrome(10));
    }
}

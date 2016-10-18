package com.hongtu.leetcode;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by hongtu on 16-10-18.
 *
 * The count-and-say sequence is the sequence of integers beginning as follows:
 * 1, 11, 21, 1211, 111221, ...

 * 1 is read off as "one 1" or 11.
 * 11 is read off as "two 1s" or 21.
 * 21 is read off as "one 2, then one 1" or 1211.
 * Given an integer n, generate the nth sequence.

 Note: The sequence of integers will be represented as a string.
 */
public class CountAndSay {
    public String countAndSay(int n) {
        if(n == 1) {
            return "1";
        } else if(n == 2) {
            return "11";
        } else {
            String strN1 = countAndSay(n - 1);
            return parse(strN1);
        }
    }

    private String parse(String strN1) {
        String result = "";
        char now = strN1.charAt(0);
        int count = 1;
        for(int i = 1; i < strN1.length(); i++) {
            if(now == strN1.charAt(i)) {
                count ++;
            } else {
                result += (count + "" + now);
                now = strN1.charAt(i);
                count = 1;
            }
        }
        result += (count + "" + now);
        return result;
    }


    public static void main(String[] args) {
        CountAndSay countAndSay = new CountAndSay();
        System.out.println(countAndSay.countAndSay(6));
    }
}

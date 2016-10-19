package com.hongtu.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by hongtu on 2016/10/18.
 */
public class Roman2Integer {
    public int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int value = map.get(s.charAt(0));
        int result = value;
        for(int i = 1; i < s.length(); i++) {
            char ind2 = s.charAt(i);
            int value2 = map.get(ind2);
            if(value < value2) {
                result = result - (2 * value) + value2;
            } else {
                result += value2;
            }
            value = value2;
        }
        return result;
    }

    public static void main(String[] args) {
        Roman2Integer roman2Integer = new Roman2Integer();
        System.out.println(roman2Integer.romanToInt("MMMDLXXXVI"));
    }
}

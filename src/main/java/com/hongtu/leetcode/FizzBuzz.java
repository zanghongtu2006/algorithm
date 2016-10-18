package com.hongtu.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hongtu on 16-10-18.
 *
 * Write a program that outputs the string representation of numbers from 1 to n.

 * But for multiples of three it should output “Fizz” instead of the number
 * and for the multiples of five output “Buzz”.
 * For numbers which are multiples of both three and five output “FizzBuzz”.
 */
public class FizzBuzz {
    public List<String> fizzBuzz(int n ) {
        List<String> list = new ArrayList<String>();
        for(int i = 1; i <= n; i++) {
            int b = i % 3;
            int f = i % 5;
            if(b != 0 && f != 0) {
                list.add("" + i);
            } else if(b == 0 && f != 0) {
                list.add("Fizz");
            } else if(b != 0 && f == 0) {
                list.add("Buzz");
            } else {
                list.add("FizzBuzz");
            }
        }
        return list;
    }

    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        System.out.println(fizzBuzz.fizzBuzz(15));
    }
}

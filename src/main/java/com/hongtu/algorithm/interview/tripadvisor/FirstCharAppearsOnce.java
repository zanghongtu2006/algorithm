package com.hongtu.algorithm.interview.tripadvisor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hongtu on 16-10-31.
 */
public class FirstCharAppearsOnce {
    public static void main(String[] args) {
        String origin = "dabastadaagada";
        System.out.println(choose(origin));
    }

    private static char choose(String origin) {
        List<Character> lists = new ArrayList<Character>();
        List<Character> errorLists = new ArrayList<Character>();

        for (int i = 0; i < origin.length(); i++) {
            Character c = origin.charAt(i);
            if (lists.contains(c)) {
                lists.remove(c);
                errorLists.add(c);
            } else if (!errorLists.contains(c)) {
                lists.add(c);
            }
        }
        return lists.get(0);
    }
}

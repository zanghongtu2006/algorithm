package com.hongtu.algorithm.recursive;

/**
 * Created by hongtu_zang on 2016/8/26.
 * 汉诺塔
 */
public class HanoiTower {
    private static long step = 0;

    public HanoiTower() {
    }

    public long move(int plates, char from, char inner, char to) {
        if(plates == 1) {
//            System.out.println("Move " + plates + " from " + from + " to " + to);
            step ++;
        } else {
            move(plates - 1, from, to, inner);
//            System.out.println("Move " + plates + " from " + from + " to " + to);
            step ++;
            move(plates - 1, inner, from, to);
        }
        return step;
    }

    public static void main(String[] args) {
        HanoiTower tower = new HanoiTower();
        int level = 64;
        long step = tower.move(level, 'A', 'B', 'C');
        System.out.println("Tower Level: " + level + ", Step: " + step);
    }
}

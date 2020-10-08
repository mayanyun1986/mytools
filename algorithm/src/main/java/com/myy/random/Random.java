package com.myy.random;

import java.util.HashSet;
import java.util.Set;

public class Random {

    private static final long maxshort = 65536L;
    private static final long multiplier = 1194211693L;
    private static final long adder = 12345L;

    public int rand(long range) {
        long randSeed = multiplier * (System.nanoTime()) + adder;
        return Math.abs((int)((randSeed >> 32) % range));
    }

    public double fRand() {
        return (double) rand(maxshort) / (double) maxshort;
    }

    public static void main(String[] args) throws Exception {

        Set<Integer> set = new HashSet<Integer>();

        for (int i = 0; i < 100; i ++) {
            int rand = new Random().rand(1000);
            System.out.println(rand);
            set.add(rand);
        }
        System.out.println("------------");
        System.out.println(set.size());

        Set<Double> set2 = new HashSet<Double>();

        for (int i = 0; i < 100; i ++) {
            double rand = new Random().fRand();
            System.out.println(rand);
            set2.add(rand);
        }
        System.out.println("------------");
        System.out.println(set2.size());
    }
}

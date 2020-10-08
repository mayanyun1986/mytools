package com.myy.random;

public class Pi {
     public static double darts(int n) {
        int k = 0;
        Random random = new Random();
        for (int i = 0; i < n; i ++) {
            double x = random.fRand();
            double y = random.fRand();
            if ((x * x + y * y) <= 1) {
                k ++;
            }
        }
        return 4 * k / (double)n;
    }

    public static void main(String[] args) {
        double pi = darts(100000000);
        System.out.println(pi);
    }
}

package com.jjd.algorithm.math;

/**
 * @author jjd
 * @date 2020-08-31
 */
public class Gcd {
    public static void main(String[] args) {
        int gcd = gcd(2, 10);
        System.out.println(gcd);
    }

    /**
     * 求最大公约数
     * @param p 数1
     * @param q 数2
     * @return 最大公约数
     */
    public static int gcd(int p, int q) {
        if (q == 0) {
            return p;
        }
        int r = p % q;
        return gcd(q, r);
    }
}

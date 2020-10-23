package com.jjd.algorithm.search;

/**
 * @author jjd
 * @date 2020-08-31
 */
public class BinarySearch {
    public static void main(String[] args) {
        //System.out.println(2.0e-6 * 100000000.1);     //200.0000002
        //System.out.println(true && false || true && true); //ture
        //System.out.println(((1 + 2.236) / 2));            //1.618
        //System.out.println(4.1 >= 4); //true
        //System.out.println(1 + 2 + "3");//33
        //System.out.println();

        /*int f = 0;
        int g = 1;
        for (int i = 0; i <= 15; i++) {
            System.out.println(f);
            f = f + g;
            g = f - g;
        }*/
        /*
        0
        1
        1
        2
        3
        5
        8
        13
        21
        34
        55
        89
        144
        233
        377
        610
        */

        /*double t = 9.0;
        while (Math.abs(t - 9.0 / t) > .001) {
            t = (9.0/t + t) / 2.0;
            System.out.printf("%.5f\n", t);
            5.00000
            3.40000
            3.02353
            3.00009
        }*/

       /* int sum = 0;
        for (int i = 1; i < 1000; i++) {
            for (int j = 0; j < i; j++) {
                sum++;
            }
            System.out.println(sum);
        }
        System.out.println(sum);
        1
        3
        6
        10
        15
        21
        28
        36
        */

        /*int sum = 0;
        for (int i = 1; i < 1000; i *= 2) {
            System.out.println(i);
            for (int j = 0; j < 1000; j++) {
                sum++;
            }
        }
        System.out.println(sum); sum = 10000 */

        System.out.println('b');//b
        System.out.println('b' + 'c');//197
        System.out.println((char) ('a' + 4)); //e
    }
}

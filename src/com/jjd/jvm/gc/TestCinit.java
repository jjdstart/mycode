package com.jjd.jvm.gc;

/**
 * @author jjd
 * @date 2020-07-12
 */
public class TestCinit {

    public static int i = 1;

    static {
        i = 0;
        System.out.println(i);
    }
}

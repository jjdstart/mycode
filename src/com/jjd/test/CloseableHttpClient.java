package com.jjd.test;

import org.apache.http.annotation.ThreadSafe;

/**
 * @author jjd
 * @date 2020-06-03
 */

@ThreadSafe
public abstract class CloseableHttpClient  {

    public static void main(String[] args) {
        test();
    }

    private static void test() {
        double v = Double.parseDouble("");
        System.out.println(v);
    }
}


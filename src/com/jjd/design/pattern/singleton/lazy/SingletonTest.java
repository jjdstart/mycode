package com.jjd.design.pattern.singleton.lazy;

/**
 * @author jjd
 * @date 2020-05-25
 */
public class SingletonTest {
}

class Singleton1 {
    private Singleton1() {

    }

    private static Singleton1 instance;

    public static Singleton1 getInstance() {
        if (instance == null) {
            instance = new Singleton1();
        }
        return instance;
    }
}


class Singleton2 {
    private Singleton2() {

    }

    private static Singleton2 instance;

    public static synchronized Singleton2 getInstance() {
        if (instance == null) {
            instance = new Singleton2();
        }

        return instance;
    }
}

class Singleton3 {
    private Singleton3() {

    }

    private volatile static Singleton3 instance;

    public static Singleton3 getInstance() {
        if (instance == null) {
            synchronized (Singleton3.class) {
                if (instance == null) {
                    instance = new Singleton3();
                }
            }
        }
        return instance;
    }

}

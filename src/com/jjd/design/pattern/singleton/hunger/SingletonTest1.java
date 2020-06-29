package com.jjd.design.pattern.singleton.hunger;

/**
 * @author jjd
 * @date 2020-05-25
 */
public class SingletonTest1 {
    public static void main(String[] args) {
        Singleton2 instance = Singleton2.getInstance();
        Singleton2 instance2 = Singleton2.getInstance();
        System.out.println(instance == instance2);
    }
}

class Singleton1 {

    private static Singleton1 instance = new Singleton1();

    private Singleton1() {

    }

    public static Singleton1 getInstance() {
        return instance;
    }
}

class Singleton2 {
    private static Singleton2 instance;

    static {
        instance = new Singleton2();
    }

    public static Singleton2 getInstance() {
        return instance;
    }
    private Singleton2() {

    }
}



package com.jjd.design.pattern.singleton.inner.classes;

/**
 * @author jjd
 * @date 2020-05-25
 */
public class SingletonTest {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
        System.out.println(instance == instance1);
    }
}

class Singleton{
    private Singleton() {

    }

    private static class SingletonInstance{
        public static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonInstance.INSTANCE;
    }
}
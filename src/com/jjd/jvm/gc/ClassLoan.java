package com.jjd.jvm.gc;

/**
 * @author jjd
 * @date 2020-07-08
 */
public class ClassLoan {
    public static void main(String[] args) {
        System.out.println(SubClass.value);
    }
}

class SuperClass {

    public static int value = 123;

    static {
        System.out.println("Super Class Loaning");
    }
}

class SubClass extends SuperClass{

    static {
        System.out.println("Sub Class Loaning");
    }

}


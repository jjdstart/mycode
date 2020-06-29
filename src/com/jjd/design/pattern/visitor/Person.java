package com.jjd.design.pattern.visitor;

/**
 * @author jjd
 * @date 2020-06-01
 */
public abstract class Person {

    public abstract void accept(Action action);
}

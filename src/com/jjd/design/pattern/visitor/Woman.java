package com.jjd.design.pattern.visitor;

/**
 * @author jjd
 * @date 2020-06-01
 */
public class Woman extends Person{

    @Override
    public void accept(Action action) {
        action.getWomanResult(this);
    }
}

package com.jjd.design.pattern.visitor;

/**
 * @author jjd
 * @date 2020-06-01
 */
public class Wait extends Action{

    @Override
    public void getManResult(Man man) {
        System.out.println("男人给出在等等");
    }

    @Override
    public void getWomanResult(Woman woman) {
        System.out.println("女人给出在等等");
    }
}

package com.jjd.design.pattern.decorator;

/**
 *
 * @author jjd
 * @date 2020-05-30
 */
public class Coffee extends Drink{

    @Override
    public float cost() {
        return super.getPrice();
    }
}

package com.jjd.design.pattern.decorator;

/**
 * @author jjd
 * @date 2020-05-30
 */
public class Mike extends Decorator{

    public Mike(Drink drink) {
        super(drink);
        setDes("Mike");
        setPrice(2.0f);
    }
}
